package us.coastalhacking.corvus.annotations.ui.common;

import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.SourceRange;

@SuppressWarnings("restriction")
public class E4ResourceAdapter {

	public static MarkerDTO adapt(Object element, Adapter adapter) {
		MarkerDTO dto = new MarkerDTO();

		// Obtain start and end characters for the DTO
		// TODO: test
		final ISourceReference sourceReference = adapter.adapt(element, ISourceReference.class);
		if (sourceReference != null) {
			adaptSourceReference(sourceReference, dto);
		}
		
		// Obtain resource and text
		// TODO: test
		final IJavaElement javaElement = adapter.adapt(element, IJavaElement.class);
		if (javaElement != null) {
			adaptJavaElement(javaElement, dto);
		}

		return dto;
	}

	private static void adaptSourceReference(ISourceReference sourceReference, MarkerDTO dto) {
		try {
			ISourceRange sourceRange = sourceReference.getNameRange();
			if (SourceRange.isAvailable(sourceRange)) {
				dto.charStart = sourceRange.getOffset();
				dto.charEnd = dto.charStart + sourceRange.getLength();
			}
		} catch (JavaModelException e) {
			// TODO log
			e.printStackTrace();
		}
	}

	private static void adaptJavaElement(IJavaElement javaElement, MarkerDTO dto) {
		dto.resource = javaElement.getResource();

		switch (javaElement.getElementType()) {
		case IJavaElement.TYPE:
			final IType iType = (IType)javaElement;
			dto.text = iType.getFullyQualifiedName();
			break;
		case IJavaElement.METHOD:
			final IType parent = (IType)javaElement.getParent();
			dto.text = String.format("%s.%s", parent.getFullyQualifiedName(), javaElement.getElementName());
			break;
		default:
			dto.text = javaElement.getElementName();	
		}
	}

}
