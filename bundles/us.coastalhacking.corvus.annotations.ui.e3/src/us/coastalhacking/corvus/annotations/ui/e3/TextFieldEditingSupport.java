package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.markers.MarkerItem;

import us.coastalhacking.corvus.annotations.Markers;

public class TextFieldEditingSupport extends EditingSupport {

	private TextCellEditor editor;
	private String markerType;
	private String markerAttribute;
	
	public TextFieldEditingSupport(ColumnViewer viewer, String markerType, String markerAttribute, int style) {
		super(viewer);
		this.editor = new TextCellEditor((Composite) viewer.getControl(), style);
		this.markerType = markerType;
		this.markerAttribute = markerAttribute;
	}

	public TextFieldEditingSupport(ColumnViewer viewer, String markerType, String markerAttribute) {
		this(viewer, markerType, markerAttribute, SWT.SINGLE);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return editor;
	}

	@Override
	protected boolean canEdit(Object element) {
		if (element instanceof MarkerItem) {
			MarkerItem item = (MarkerItem)element;

			boolean isMarkerType = false;
			try {
				isMarkerType = item.getMarker().getType().equals(markerType);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return isMarkerType && item.getAttributeValue(IMarker.USER_EDITABLE, false);
		}
		return false;
	}

	@Override
	protected Object getValue(Object element) {
		if (element instanceof MarkerItem) {
			MarkerItem item = (MarkerItem)element;
			return item.getAttributeValue(markerAttribute, Markers.EMPTY_STRING);
		}
		return Markers.EMPTY_STRING;
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (element instanceof MarkerItem) {
			MarkerItem item = (MarkerItem)element;
			try {
				item.getMarker().setAttribute(markerAttribute, value);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
