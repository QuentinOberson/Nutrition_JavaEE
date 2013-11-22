import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import business_objects.User;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		User user = new User("Martin", "Ecoffey", "m.ecoffey@gmail.com");
		
		try {
			Hashtable env = new Hashtable();
			env.put(Context.PROVIDER_URL, "jdbc:mysql://localhost:3306/nutrition_database");
			env.put(Context.SECURITY_PRINCIPAL, "quentin");
			env.put(Context.SECURITY_CREDENTIALS, "quentin");
			
			Context ctx = new InitialContext(env);
			
			NutritionService service = (NutritionService)ctx.lookup(
					"java:comp/env/jdbc/nutrition_database/NutritionService/local");
			
			service.storeUser(user);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
