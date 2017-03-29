/**
 * 
 */
package us.coastalhacking.corvus.annotations.ui.e3;

import org.eclipse.ui.views.markers.MarkerSupportView;

public class SinkMarkersView extends MarkerSupportView {

	public static final String SINK_GENERATOR = "us.coastalhacking.corvus.annotations.sinkGenerator";
	
	public SinkMarkersView() {
		super(SINK_GENERATOR);

	}

}
