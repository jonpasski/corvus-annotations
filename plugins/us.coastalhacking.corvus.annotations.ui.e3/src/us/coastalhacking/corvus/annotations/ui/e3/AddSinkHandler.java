package us.coastalhacking.corvus.annotations.ui.e3;

import us.coastalhacking.corvus.annotations.ui.common.AnnotationController;
import us.coastalhacking.corvus.annotations.ui.common.MarkerDTO;

public class AddSinkHandler extends AbstractAnnotationHandler {

	@Override
	protected void doExecute(MarkerDTO dto) {
		AnnotationController.addSink(dto);
		
	}

}
