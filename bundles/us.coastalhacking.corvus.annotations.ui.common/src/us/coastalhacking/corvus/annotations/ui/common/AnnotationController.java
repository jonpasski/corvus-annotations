package us.coastalhacking.corvus.annotations.ui.common;

import org.eclipse.core.resources.IMarker;

import us.coastalhacking.corvus.annotations.Markers;

public class AnnotationController {

	/**
	 * Creates an entry point marker and associated tasks
	 * 
	 * @param dto  a marker dto containing the information needed to make a marker
	 */
	// TODO: test
	public static void addEntryPoint(MarkerDTO dto) {
		try {
			// Create entry point
			IMarker entryPointMarker = MarkerAdapter.adapt(dto, Markers.ENTRY_POINT);
			entryPointMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			entryPointMarker.setAttribute(IMarker.MESSAGE, String.format("Entry point: %s", dto.text));

			// Create tasks around entry point
			IMarker idempotentMarker = MarkerAdapter.adapt(dto, IMarker.TASK);
			idempotentMarker.setAttribute(IMarker.MESSAGE, String.format("Review idempotency on entry point %s", dto.text));
			idempotentMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);

			IMarker authenticationMarker = MarkerAdapter.adapt(dto, IMarker.TASK);
			authenticationMarker.setAttribute(IMarker.MESSAGE, String.format("Review authentication on entry point %s", dto.text));
			authenticationMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);

			IMarker authorizationMarker = MarkerAdapter.adapt(dto, IMarker.TASK);
			authorizationMarker.setAttribute(IMarker.MESSAGE, String.format("Review authorization on entry point %s", dto.text));
			authorizationMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);

		} catch (Exception e) {
			// TODO : log
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * Creates a sink marker and associated tasks
	 * 
	 * @param dto  a marker dto containing the information needed to make a marker
	 */
	// TODO: test
	public static void addSink(MarkerDTO dto) {
		try {
			// Create sink
			IMarker sinkMarker = MarkerAdapter.adapt(dto, Markers.SINK);
			sinkMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			sinkMarker.setAttribute(IMarker.MESSAGE, String.format("Sink: %s", dto.text));

			// Create tasks around sink
			IMarker controllabilityMarker = MarkerAdapter.adapt(dto, IMarker.TASK);
			controllabilityMarker.setAttribute(IMarker.MESSAGE, String.format("Review user-controllability of data to sink %s", dto.text));
			controllabilityMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);

		} catch (Exception e) {
			// TODO : log
			e.printStackTrace();
		}
	}


	/**
	 * 
	 * Creates an issue and associated tasks
	 * 
	 * @param dto  a marker dto containing the information needed to make a marker
	 */
	// TODO: test
	public static void addIssue(MarkerDTO dto) {
		try {
			// Create issue
			IMarker issueMarker = MarkerAdapter.adapt(dto, Markers.ISSUE);
			issueMarker.setAttribute(IMarker.MESSAGE, String.format("Security issue with %s", dto.text));
			issueMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);
			issueMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);

			// Create tasks around issue
			IMarker documentMarker = MarkerAdapter.adapt(dto, IMarker.TASK);
			documentMarker.setAttribute(IMarker.MESSAGE, String.format("Document security issue with %s", dto.text));
			documentMarker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_HIGH);

		} catch (Exception e) {
			// TODO : log
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Creates a taint marker
	 * 
	 * @param dto  a marker dto containing the information needed to make a marker
	 */
	// TODO: test
	public static void addTaint(MarkerDTO dto) {
		try {
			IMarker taintMarker = MarkerAdapter.adapt(dto, Markers.TAINT);
			taintMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			taintMarker.setAttribute(IMarker.MESSAGE, String.format("Tainted: %s", dto.text));

		} catch (Exception e) {
			// TODO : log
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Creates a sanitizer marker
	 * 
	 * @param dto  a marker dto containing the information needed to make a marker
	 */
	// TODO: test
	public static void addSanitizer(MarkerDTO dto) {
		try {
			IMarker sanitizerMarker = MarkerAdapter.adapt(dto, Markers.SANITIZER);
			sanitizerMarker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			sanitizerMarker.setAttribute(IMarker.MESSAGE, String.format("Sanitizer: %s", dto.text));

		} catch (Exception e) {
			// TODO : log
			e.printStackTrace();
		}
	}
}
