/**
 * 
 */
package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class TaintedMarkersView extends MarkerSupportView {

	public static final String TAINTED_GENERATOR = "us.coastalhacking.corvus.annotations.taintedGenerator";
	
	public TaintedMarkersView() {
		super(TAINTED_GENERATOR);

	}

}
