package us.coastalhacking.corvus.annotations.ui.e4.handlers;

import us.coastalhacking.corvus.annotations.ui.common.AnnotationController;
import us.coastalhacking.corvus.annotations.ui.common.MarkerDTO;


public class AddSinkHandler extends AbstractHandler {

	@Override
	public void doExecute(MarkerDTO dto) {
		AnnotationController.addSink(dto);
		
	}

}
