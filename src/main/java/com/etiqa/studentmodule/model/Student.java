package com.etiqa.studentmodule.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity
	@JsonIgnoreProperties
	@Table(name="student")
	public class Student {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 
	 @Column(name="firstname")
	 private String firstname;
	 
	 @Column(name="lastname")
	 private String lastname;
	 
	 @Column(name="age")
	 private int age;
	 
	 @Column(name="email")
	 private String email;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
    
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
