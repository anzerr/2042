
import java.util.Arrays;

public class CliParser {
	private String _action;
	private String[] _argument;
	
	public CliParser(String args[]) {
		this._action = (args.length > 0) ? args[0] : "";
		int n = args.length - 1;
		this._argument = new String[n];
		if (args.length > 1) {
			System.arraycopy(args, 1, this._argument, 0, n);
		}
	}

	public String action() {
        return (this._action);
	}
	
	public String[] argument() {
        return (this._argument);
	}
}
