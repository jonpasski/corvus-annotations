package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class TaintedDetailsField extends AbstractTextMarkerField {


	public TaintedDetailsField() {
		super();
		this.markerType = Markers.TAINT;
		this.markerAttribute = Markers.TAINT_ATTR_DETAILS;
	}

}
