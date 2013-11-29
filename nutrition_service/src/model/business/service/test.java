package model.business.service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.business.entities.User;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("nutrition_service");
	    EntityManager em = factory.createEntityManager();
	    
	    // read the existing entries and write to console
	    Query q = em.createQuery("select u from User u");
	    List<User> todoList = q.getResultList();
	    
	    for (User user : todoList) {
	      System.out.println("Firstname: "+user.getFirstname() +" ,Lastname: "+ user.getLastname());
	    }
	    
	    System.out.println("Size: " + todoList.size());

	    // create new todo
	    em.getTransaction().begin();
	    User newUser = new User();
	    newUser.setFirstname("Martin");
	    newUser.setLastname("Ecoffey");
	    newUser.setBirthday(new Date(1994, 12, 24));
	    newUser.setEmail("m.ecoffey@gmail.com");
	    newUser.setPassword("pass");
	    
	    em.persist(newUser);
	    em.getTransaction().commit();

	    em.close();
	}

}
