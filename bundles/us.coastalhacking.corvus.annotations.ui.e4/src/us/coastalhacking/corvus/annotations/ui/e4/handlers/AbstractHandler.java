package us.coastalhacking.corvus.annotations.ui.e4.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.adapter.Adapter;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jface.viewers.IStructuredSelection;

import us.coastalhacking.corvus.annotations.ui.common.MarkerAdapter;
import us.coastalhacking.corvus.annotations.ui.common.MarkerDTO;

@SuppressWarnings("restriction")
public abstract class AbstractHandler {

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection selection, Adapter adapter) {

		if (selection == null || selection.isEmpty()) return;

		Object element = selection.getFirstElement();
		MarkerDTO dto = adapt(element, adapter);

		if (dto == null || dto.resource == null) return;

		doExecute(dto);
	}

	protected abstract void doExecute(MarkerDTO dto);

	private MarkerDTO adapt(Object element, Adapter adapter) {
		MarkerDTO dto = new MarkerDTO();

		// Obtain start and end characters for the DTO
		// TODO: test
		final ISourceReference sourceReference = adapter.adapt(element, ISourceReference.class);
		if (sourceReference != null) {
			MarkerAdapter.adaptSourceReference(sourceReference, dto);
		}
		
		// Obtain resource and text
		// TODO: test
		final IJavaElement javaElement = adapter.adapt(element, IJavaElement.class);
		if (javaElement != null) {
			MarkerAdapter.adaptJavaElement(javaElement, dto);
		}

		return dto;
	}

}