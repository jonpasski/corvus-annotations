package us.coastalhacking.corvus.annotations;

public interface Markers {

	public String ENTRY_POINT = "us.coastalhacking.corvus.annotations.entrypoint";
	public String ENTRY_POINT_TYPE = "Entry Point";
	
	public String ISSUE = "us.coastalhacking.corvus.annotations.issue";
	public String ISSUE_TYPE = "Security Issue";
	
	public String SANITIZER = "us.coastalhacking.corvus.annotations.sanitizer";
	public String SANITIZER_TYPE = "Data Sanitizer";

	public String SINK = "us.coastalhacking.corvus.annotations.sink";
	public String SINK_TYPE = "Sink";

	public String TAINT = "us.coastalhacking.corvus.annotations.taint";
	public String TAINT_TYPE = "Tainted Data";
}
