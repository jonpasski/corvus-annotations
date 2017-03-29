package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class EntryPointAuthorizationField extends AbstractTextMarkerField {

	public EntryPointAuthorizationField() {
		super();
		this.markerType = Markers.ENTRY_POINT;
		this.markerAttribute = Markers.EP_ATTR_AUTHZ;

	}


}
