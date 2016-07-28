
import java.io.*;

public class DevisEntity extends EntityBase implements EnityInterface {
	private String project;
	private int id;
	
	public DevisEntity(String p) {
		project = "./projects/" + p + "/Devis/log";
		this.setProject(project);
		try {
			this.setId(codeMap.get(project));
		} catch (Throwable t) {
			int code = open(project);
			codeMap.put(project, code);
			this.setId(code);
		}
	}
}
