package com.example.demo.service;

import java.util.Collection;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.example.demo.exception.StudentNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	
	private final StudentRepository repository;
	
	public StudentServiceImpl(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public Collection<Student> getAllStudents() {
		return repository.findAll();
	}

	
	@Override
	public Response getById(Long id) {
		Student student = repository.findById(id).orElseThrow(StudentNotFoundException::new);
		return Response.ok(student).build();
	} 
	
	
	
}
