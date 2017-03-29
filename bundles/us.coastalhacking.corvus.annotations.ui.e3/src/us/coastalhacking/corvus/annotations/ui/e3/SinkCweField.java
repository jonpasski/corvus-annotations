package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class SinkCweField extends AbstractTextMarkerField {

	public SinkCweField() {
		super();
		this.markerType = Markers.SINK;
		this.markerAttribute = Markers.SINK_ATTR_CWE;

	}

}
