package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.ui.views.markers.MarkerField;
import org.eclipse.ui.views.markers.MarkerItem;

import us.coastalhacking.corvus.annotations.Markers;

public abstract class AbstractTextMarkerField extends MarkerField {
	
	protected String markerType;
	protected String markerAttribute;
	
	@Override
	public EditingSupport getEditingSupport(ColumnViewer viewer) {
		return new TextFieldEditingSupport(viewer, markerType, markerAttribute);
	}

	@Override
	public String getValue(MarkerItem item) {
		return item.getAttributeValue(markerAttribute, Markers.EMPTY_STRING);
	}

}
