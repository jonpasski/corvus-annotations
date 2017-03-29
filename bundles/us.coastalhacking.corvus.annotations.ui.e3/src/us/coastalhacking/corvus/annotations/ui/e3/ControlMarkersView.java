/**
 * 
 */
package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class ControlMarkersView extends MarkerSupportView {

	public static final String CONTROL_GENERATOR = "us.coastalhacking.corvus.annotations.controlGenerator";
	
	public ControlMarkersView() {
		super(CONTROL_GENERATOR);

	}

}
