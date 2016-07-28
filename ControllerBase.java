
import java.util.Arrays;

public class ControllerBase {
	public Boolean next(int code, EnityInterface ent) {
		if (ent.event() == code) {
			ent.accept();
			return (true);
		}
		return (false);
	}

	public void reset(EnityInterface ent) {
		ent.set(1);
	}
	
	public void reject(EnityInterface ent) {
		ent.reject();
	}
}
