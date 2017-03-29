/**
 * 
 */
package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class EntryPointMarkersView extends MarkerSupportView {

	public static final String ENTRY_POINT_GENERATOR = "us.coastalhacking.corvus.annotations.entryPointGenerator";
	
	public EntryPointMarkersView() {
		super(ENTRY_POINT_GENERATOR);

	}

}
