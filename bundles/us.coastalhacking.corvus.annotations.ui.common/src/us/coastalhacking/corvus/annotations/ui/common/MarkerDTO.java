package us.coastalhacking.corvus.annotations.ui.common;

import org.eclipse.core.resources.IResource;

public class MarkerDTO {

	public IResource resource;
	
	/**
	 * @see org.eclipse.core.resources.IMarker#LINENUMBER
	 */
	public int lineNumber = -1;
	
	/**
	 * @see org.eclipse.core.resources.IMarker#CHAR_START
	 */
	public int charStart = -1;
	
	/**
	 * @see org.eclipse.core.resources.IMarker#CHAR_END
	 */
	public int charEnd = -1;
	
	/**
	 * @see org.eclipse.core.resources.IMarker#MESSAGE
	 */
	public String text = "";

}
