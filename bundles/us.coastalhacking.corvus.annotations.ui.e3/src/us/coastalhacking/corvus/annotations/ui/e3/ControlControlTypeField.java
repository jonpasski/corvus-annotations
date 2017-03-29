package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class ControlControlTypeField extends AbstractTextMarkerField {

	public ControlControlTypeField() {
		super();
		this.markerType = Markers.CONTROL;
		this.markerAttribute = Markers.CONTROL_ATTR_CONTROL_TYPE;

	}

}
