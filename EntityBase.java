
import java.util.Arrays;
import java.util.HashMap;
import java.io.*;

public class EntityBase implements EnityInterface {
	public static final HashMap<String, Integer> codeMap;
    static {
        codeMap = new HashMap<String, Integer>();
    }
	
	private String project;
	private int id;
	
	public void setProject(String str) {
		this.project = str;
	}
	public void setId(int n) {
		this.id = n;
	}
	
	public int open(String p) {
		try {
			BufferedReader in = new BufferedReader(new FileReader(p));
			String last = ";0", line;

			while ((line = in.readLine()) != null) {
				last = line;
			}
			String[] part = last.split(";");
			return (Integer.parseInt(part[part.length - 1].trim()));
		} catch (Throwable t) {
			t.printStackTrace(System.out);				
		}
		return (0);
	}
	
	public int event() {
		return (this.id);
	}
	
	public void set(int code) {
		Logs l = new Logs();
		l.write(this.project, System.currentTimeMillis() + "; dave; " + this.id + "; " + code + "\r\n");
		this.id = code;
		codeMap.put(this.project, code);
	}
	
	public void accept() {
		if (this.id != -1) {
			set(this.id + 1);
		}
	}
	
	public void reject() {
		set(-1);
	}
}
