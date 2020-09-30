package com.example.demo.service;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.demo.model.Student;

@Path("students")// se sont les routes 
@Produces(MediaType.APPLICATION_JSON) //les méhtodes de cette class sont des méthodes qui vont être des services dans serveur
public interface StudentService {
	
	@GET
	public Collection<Student> getAllStudents();
	
	
	@Path("{id}")
	@GET
	public Response getById(@PathParam("id") Long id); // PathParam: on passe l'id dans l'url
	
	
    
}
