package us.coastalhacking.corvus.annotations.ui.common;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.SourceRange;
import org.eclipse.jface.text.ITextSelection;

public class MarkerAdapter {


	public static IMarker adapt(MarkerDTO dto, String markerType) throws CoreException {
		IMarker marker = dto.resource.createMarker(markerType);
		addLineNumber(marker, dto);
		addStartEndChars(marker, dto);
		return marker;
	}

	public static void addLineNumber(IMarker marker, MarkerDTO dto) {
		if (dto.lineNumber != -1 && marker != null)
			try {
				marker.setAttribute(IMarker.LINE_NUMBER, dto.lineNumber);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	public static void addStartEndChars(IMarker marker, MarkerDTO dto) {
		if (dto.charStart != -1 && dto.charEnd != -1 && marker != null) {
			try {
				marker.setAttribute(IMarker.CHAR_START, dto.charStart);
				marker.setAttribute(IMarker.CHAR_END, dto.charEnd);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	public static void adaptSourceReference(ISourceReference sourceReference, MarkerDTO dto) {
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

	public static void adaptJavaElement(IJavaElement javaElement, MarkerDTO dto) {
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
	
	public static void adaptTextSelection(ITextSelection textSelection, MarkerDTO dto) {
		dto.charStart = textSelection.getOffset();
		dto.charEnd = dto.charStart + textSelection.getLength();
		dto.lineNumber = textSelection.getStartLine();
	}
}
