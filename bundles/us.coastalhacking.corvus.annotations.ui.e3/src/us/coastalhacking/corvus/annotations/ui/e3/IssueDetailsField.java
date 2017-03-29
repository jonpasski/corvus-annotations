package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.Markers;

public class IssueDetailsField extends AbstractTextMarkerField {

	public IssueDetailsField() {
		super();
		this.markerType = Markers.ISSUE;
		this.markerAttribute = Markers.ISSUE_ATTR_DETAILS;

	}

}
