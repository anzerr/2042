
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
    }

	public void run(String action, String[] argument) {
		try	{
			String[] map = routeMap.get(action);
			Class<?> c = Class.forName(map[0]);
			Method method = c.getDeclaredMethod(map[1], String[].class);
			method.invoke(c, new Object[] {argument});
		} catch (Throwable t) {
			t.printStackTrace (System.out);				
		}	
	}
}
