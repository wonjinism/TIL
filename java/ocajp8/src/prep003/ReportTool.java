package prep003;

interface Exportable {
	Void export();
}

class Tool implements Exportable{
	protected void export() {	// line n1
		System.out.println("Tool::export"););
	}
}

public class ReportTool extends Tool implements Exportable {
	public void export() {	//line n2 // compilation fails
		System.out.println("RTool::export");
	}
	
	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	
	public static void callExport (Exportable ex) {
		ex.export();
	}
}