package us.coastalhacking.corvus.annotations.ui.e4.handlers;

import us.coastalhacking.corvus.annotations.ui.common.AnnotationController;
import us.coastalhacking.corvus.annotations.ui.common.MarkerDTO;


public class AddSanitizerHandler extends AbstractHandler {

	@Override
	protected void doExecute(MarkerDTO dto) {
		AnnotationController.addSanitizer(dto);
		
	}

}
