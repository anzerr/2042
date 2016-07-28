
import java.util.Arrays;

public class CDevis extends ControllerBase {
	public Boolean next(String project, int code) {
		return (super.next(code, new DevisEntity(project)));
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
	
	public void send(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 1);
		}
	}
	
	public void response(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 2);
		}
	}
	
	public void validate(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 3);
		}
	}
	
	public void confirmForPayment(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 4);
		}
	}
	
	public void devIsToSign(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 5);
		}
	}
	
	public void sendBill(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 6);
		}
	}
	
	public void billValidation(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 7);
		}
	}
	
	public void billPayed(String[] arg) {
		if (arg.length > 0) {
			next(arg[0], 8);
		}
	}
}
