package com.tackit.controller;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
//import com.sun.jersey.core.header.FormDataContentDisposition;
//import com.sun.jersey.multipart.FormDataParam;
import com.tackit.domain.User;

@Path("/user")
public class AuthController {
	
	
	@POST
	@Path("/signup")
	public Response userprofile(@FormParam("fname") String fname,
			@FormParam("lname") String lname,
			@FormParam("email") String email, 
			@FormParam("password") String password ) {
			System.out.println("name is: "+fname);
			User user = new User();
			user.setFirstName(fname);
			user.setLastName(lname);
			user.setUserName(email);
			user.setPassword(password);
		
			System.out.println("surname of the user is"+user.getLastName());
			String output = "Thankyou for registring with us you will recieve email shortly "+ user.getFirstName();
		
			System.out.println("User added");
		
		return Response.status(200).entity(output).build();

	}
	
	@POST
	@Path("/login")
	public Response loginProfile(@FormParam("email") String email,
			@FormParam("password") String password){
		System.out.println("email id is "+ email);
		System.out.println("password is "+ password);
		
		String output = "Thankyou for registring with us you will recieve email shortly ";
		return Response.status(200).entity(output).build();
	}
	
	
	@POST
	@Path("/url")
	public Response submitUrl(@FormParam("url") String url){
		System.out.println("the ur printed is: "+url);
		User user = new User();
		user.setURL(url);
		
		
		String output = "We are about to process your url and you will see all the photos from: "+user.getURL();
		return Response.status(200).entity(output).build();
	}

}
