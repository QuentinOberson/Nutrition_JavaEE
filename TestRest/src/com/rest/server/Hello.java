package com.rest.server;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.business.entities.User;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello2")
public class Hello {

  // This method is called if TEXT_PLAIN is request
  @GET
  @Path("/coucou")
  @Produces(MediaType.TEXT_PLAIN)
  public String sayPlainTextHello() {
    return "Hello Quentin facile le java ee";
  }
  
  // Envoie d'un objet
  @GET
  @Path("/objet")
  @Produces(MediaType.APPLICATION_JSON)
  public Object testObject() {
	  
	User user1 = new User(101, "Vincent", "Pont");
	
    return user1;
  }
  
  // reception du user pour voir si il est dans la bdd
  @POST
  @Path("/testLogin")
  @Produces(MediaType.TEXT_PLAIN)
  public String testLogin(String input) {
	  
	Gson gson = new Gson();
	
	// On reçoit notre user
	User user1 = gson.fromJson(input, User.class);
	
	System.out.println(user1.getLastname());
	
	return "true";
    
  }
  
  // reception de la liste user
  @POST
  @Path("/testList")
  @Produces(MediaType.TEXT_PLAIN)
  public String testListPost(String input) {
	  
	Gson gson = new Gson();
	
	Type collectionType = new TypeToken<List<User>>(){}.getType();
	List<User> ints2 = gson.fromJson(input, collectionType);
	
	for (User user : ints2) {
		System.out.println(user.getLastname());
	}
	
	return "true";
    
  }
  
  // Envoie d'une liste
  @GET
  @Path("/liste")
  @Produces(MediaType.APPLICATION_JSON)
  public String testList() {
	  
	  
	List<User> listUsers = new ArrayList() ;
	
	User user1 = new User(101, "Vincent", "Pont");
	User user2 = new User(102, "Quentin", "Gaspoz");
	User user3 = new User(103, "Robert", "Dias");
	
	listUsers.add(user1) ;
	listUsers.add(user2) ;
	listUsers.add(user3) ;
	
	Gson gson = new Gson();
	String json = gson.toJson(listUsers);
	
    return json;
  }
  

  /*
  // This method is called if XML is request
  @GET
  @Produces(MediaType.TEXT_XML)
  public String sayXMLHello() {
    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
  }

  // This method is called if HTML is request
  @GET
  @Path("/coucou")
  @Produces(MediaType.TEXT_HTML)
  public String sayHtmlHello() {
    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
  }
*/
} 
