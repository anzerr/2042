
import java.io.*;
import java.util.Arrays;

public class CProspect extends ControllerBase {
	public Boolean next(String project, int code) {
		return (super.next(code, new ProspectEntity(project)));
	}
	public void reset(String[] arg) {
		if (arg.length > 0) {
			super.reset(new ProspectEntity(arg[0]));
		}
	}
	public void reject(String[] arg) {
		if (arg.length > 0) {
			super.reject(new ProspectEntity(arg[0]));
		}
	}
	
	public void contact(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 1);
		}
	}
	
	public void valid(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 2);
		}
	}
	
	public void confirm(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 3);
		}
	}
	
	public void createDevis(String[] arg) {
		if (arg.length > 0) {
			if (next(arg[0], 4)) {
				try {
					PrintWriter writer = new PrintWriter( "./projects/" + arg[0] + "/Devis/log", "UTF-8");
					writer.println("" + System.currentTimeMillis() + "; dave; null; 1");
					writer.close();
				} catch (Throwable t) {
					t.printStackTrace(System.out);				
				}
			}
		}
	}
}
