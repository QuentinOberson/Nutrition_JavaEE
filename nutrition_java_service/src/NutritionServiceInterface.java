import java.util.List;

import javax.ejb.Local;

import business_objects.Plate;
import business_objects.User;


@Local
public interface NutritionServiceInterface {

	//This is the list of all action a client could do using the service
	public void storeUser(User user);
	public User getUserById(int id);
	public List<User> getAllUsers();
	
	public void storePlate(Plate plate);
	public List<Plate> getAllPlateByUserId(int id);
	
}
