/**
 * 
 */
package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class IssueMarkersView extends MarkerSupportView {

	public static final String ISSUE_GENERATOR = "us.coastalhacking.corvus.annotations.issueGenerator";
	
	public IssueMarkersView() {
		super(ISSUE_GENERATOR);

	}

}
