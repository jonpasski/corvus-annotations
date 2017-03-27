package us.coastalhacking.corvus.annotations.ui.common;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;

public class MarkerAdapter {


	public static IMarker adapt(MarkerDTO dto, String markerType) throws CoreException {
		IMarker marker = dto.resource.createMarker(markerType);
		addLineNumber(marker, dto);
		addStartEndChars(marker, dto);
		return marker;
	}

	public static void addLineNumber(IMarker marker, MarkerDTO dto) {
		if (dto.lineNumber != -1 && marker != null)
			try {
				marker.setAttribute(IMarker.LINE_NUMBER, dto.lineNumber);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	public static void addStartEndChars(IMarker marker, MarkerDTO dto) {
		if (dto.charStart != -1 && dto.charEnd != -1 && marker != null) {
			try {
				marker.setAttribute(IMarker.CHAR_START, dto.charStart);
				marker.setAttribute(IMarker.CHAR_END, dto.charEnd);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
