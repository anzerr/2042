
import java.io.*;

public class CProject {
	public void create(String[] arg) {
		try {
			String base = "./projects/" + arg[0] + " - " + arg[1];
			if ((new File(base)).mkdirs()) {
				if ((new File(base + "/Prospect")).mkdirs()) {
					PrintWriter writer = new PrintWriter(base + "/Prospect/log", "UTF-8");
					writer.println("" + System.currentTimeMillis() + "; dave; null; 1");
					writer.close();
					(new File(base + "/Prospect/init")).mkdirs();
					(new File(base + "/Prospect/validation")).mkdirs();
				}
				if ((new File(base + "/Devis")).mkdirs()) {
					(new File(base + "/Devis/init")).mkdirs();
				}
			}
		} catch (Throwable t) {
			t.printStackTrace (System.out);				
		}	
	}
}
