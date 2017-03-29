package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class TaintedTaintTypeField extends AbstractTextMarkerField {

	public TaintedTaintTypeField() {
		super();
		this.markerType = Markers.TAINT;
		this.markerAttribute = Markers.TAINT_ATTR_TAINT_TYPE;
	}

}
