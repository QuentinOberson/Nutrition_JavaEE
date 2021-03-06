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
			Context ctx = new InitialContext();
			
			NutritionService service = (NutritionService)ctx.lookup(
					"java:comp/env/jdbc/nutrition_database/NutritionService/local");
			
			service.storeUser(user);
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
