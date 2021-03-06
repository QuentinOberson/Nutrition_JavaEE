import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import business_objects.Plate;
import business_objects.User;


@Stateful
public class NutritionService implements NutritionServiceInterface{
	@PersistenceContext(name = "", type = PersistenceContextType.EXTENDED)
	EntityManager em;
	
	@Override
	public void storeUser(User user)
	{
		em.persist(user);
	}

	@Override
	public User getUserById(int id)
	{
		return em.find(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> result = null;
		result = em.createQuery("from User").getResultList();
		return result;
	}

	@Override
	public void storePlate(Plate plate) {
		em.persist(plate);
	}

	@Override
	public List<Plate> getAllPlateByUserId(int id) {
		return em.createQuery(
				"FROM Plate p WHERE p.user.id=:id"
				).setParameter("id", id).getResultList();
	}
	

}
