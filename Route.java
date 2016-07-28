
import java.util.Arrays;
import java.util.HashMap;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Route {
	
	private static final HashMap<String, String[]> routeMap;
    static {
        routeMap = new HashMap<String, String[]>();
		routeMap.put("project/create", new String[] {"CProject", "create"});
		
		routeMap.put("prospect/abandon", new String[] {"CProspect", "reject"});
		routeMap.put("prospect/reset", new String[] {"CProspect", "reset"});
		routeMap.put("prospect/contact", new String[] {"CProspect", "contact"});
		routeMap.put("prospect/valid", new String[] {"CProspect", "valid"});
		routeMap.put("prospect/confirm", new String[] {"CProspect", "confirm"});
		routeMap.put("prospect/devis", new String[] {"CProspect", "createDevis"});
		
		routeMap.put("devis/abandon", new String[] {"CDevis", "reject"});
		routeMap.put("devis/reset", new String[] {"CDevis", "reset"});
		routeMap.put("devis/sendToClient", new String[] {"CDevis", "send"});
		routeMap.put("devis/responseFromClient", new String[] {"CDevis", "response"});
		routeMap.put("devis/validate", new String[] {"CDevis", "validate"});
		routeMap.put("devis/confirmForPayment", new String[] {"CDevis", "confirmForPayment"});
		routeMap.put("devis/sentToSign", new String[] {"CDevis", "devIsToSign"});
		routeMap.put("devis/sendBill", new String[] {"CDevis", "sendBill"});
		routeMap.put("devis/validateBill", new String[] {"CDevis", "billValidation"});
		routeMap.put("devis/billIsPayed", new String[] {"CDevis", "billPayed"});
    }

	public void run(String action, String[] argument) {
		try	{
			String[] map = routeMap.get(action);
			Class<?> c = Class.forName(map[0]);
			Method method = c.getDeclaredMethod(map[1], String[].class);
			Object o = c.newInstance();
			method.invoke(o, new Object[] {argument});
		} catch (Throwable t) {
			t.printStackTrace (System.out);				
		}	
	}
}
