package us.coastalhacking.corvus.annotations;

public interface Markers {
	
	public String EMPTY_STRING = "";

	public String UNKNOWN = "Unknown value";
	
	public String ENTRY_POINT = "us.coastalhacking.corvus.annotations.entrypoint";
	public String ENTRY_POINT_TYPE = "Entry Point";
	public String EP_ATTR_METHOD = "method";
	public String EP_ATTR_URL = "url";
	public String EP_ATTR_AUTHN = "authentication";
	public String EP_ATTR_AUTHZ = "authorization";
	public String EP_ATTR_CSRF = "csrf";
	
	public String ISSUE = "us.coastalhacking.corvus.annotations.issue";
	public String ISSUE_TYPE = "Security Issue";
	public String ISSUE_ATTR_DETAILS = "issuedetails";
	
	public String CONTROL = "us.coastalhacking.corvus.annotations.control";
	public String CONTROL_TYPE = "Control";
	public String CONTROL_ATTR_DETAILS = "controldetails";
	public String CONTROL_ATTR_CONTROL_TYPE = "controltype";

	public String SANITIZER = "us.coastalhacking.corvus.annotations.sanitizer";
	public String SANITIZER_TYPE = "Data Sanitizer";

	public String SINK = "us.coastalhacking.corvus.annotations.sink";
	public String SINK_TYPE = "Sink";
	public String SINK_ATTR_SINK_TYPE = "sinktype";
	public String SINK_ATTR_CWE = "cwe";
	public String SINK_ATTR_DETAILS = "sinkdetails";

	public String TAINT = "us.coastalhacking.corvus.annotations.taint";
	public String TAINT_TYPE = "Tainted Data";
	public String TAINT_ATTR_TAINT_TYPE = "tainttype";
	public String TAINT_ATTR_DETAILS = "taintdetails";
}
