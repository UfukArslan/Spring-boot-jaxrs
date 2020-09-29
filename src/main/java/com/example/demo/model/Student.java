package com.example.demo.model;
import java.io.Serializable;

@SuppressWarnings("serial") // Gerer les warnings liés à la serialisation
public class Student implements Serializable {

	Long id;
	String firstName;
	String lastName;
	String year;
	public Student(Long id, String firstName, String lastName, String year) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
}
