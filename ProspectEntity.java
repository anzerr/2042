
import java.io.*;

public class ProspectEntity extends EntityBase implements EnityInterface {
	public ProspectEntity(String p) {
		String project = "./projects/" + p + "/Prospect/log";
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
