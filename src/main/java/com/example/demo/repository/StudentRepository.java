package com.example.demo.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public class StudentRepository {

	HashMap<Long, Student> students = new HashMap<>();
	
    @PostConstruct
    public void init() {
    	System.out.println("Init");
    	
    	students.put(101l, new Student(101l, "Jane", "Doe", "Junior"));
    	students.put(102l, new Student(102l, "Martin", "Fowler", "Senior"));
    	students.put(103l, new Student(103l, "Roy", "Fielding", "Freshman"));
    }	
	
	public Collection<Student> findAll() {
		System.out.println(students);
		
		return students.values();
	}
	
	
	public Optional<Student> findById(Long id){
		System.out.println("findById");
		
		Student student = null;
		if (students.containsKey(id)) student = students.get(id);
		                         
		return Optional.ofNullable(student); // lève un exception
	}
	
	
	
	
		
	}
	
