package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class EntryPointAuthenticationField extends AbstractTextMarkerField {

	public EntryPointAuthenticationField() {
		super();
		this.markerType = Markers.ENTRY_POINT;
		this.markerAttribute = Markers.EP_ATTR_AUTHN;

	}

}
