package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class SinkDetailsField extends AbstractTextMarkerField {

	public SinkDetailsField() {
		super();
		this.markerType = Markers.SINK;
		this.markerAttribute = Markers.SINK_ATTR_DETAILS;
	}

}
