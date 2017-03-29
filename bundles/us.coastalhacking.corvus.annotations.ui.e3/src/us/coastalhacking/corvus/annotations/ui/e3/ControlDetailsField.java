package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class ControlDetailsField extends AbstractTextMarkerField {

	public ControlDetailsField() {
		super();
		this.markerType = Markers.CONTROL;
		this.markerAttribute = Markers.CONTROL_ATTR_DETAILS;
	}

}
