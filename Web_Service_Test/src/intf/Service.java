package intf;

import model.business.entities.Language;
import model.business.entities.User;

public interface Service {

	public String hello();

	public boolean isRegistered(String email, String password);

	public boolean updateProfile(User user);

	public boolean registerNewUser(User user);

	public User getUserById(int id);

	public Language getLanguageById(int id);

}
