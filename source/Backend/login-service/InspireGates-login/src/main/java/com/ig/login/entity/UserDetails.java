package com.ig.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "UserDetails")
public class UserDetails {
	
	@Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String username;
	private String firstname;
	private String secondname;
	private Date dateofcreation;
	private String email;

	// Constructor
	public UserDetails() {
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public Date getDateofcreation() {
		return dateofcreation;
	}

	public void setDateofcreation(Date dateofcreation) {
		this.dateofcreation = dateofcreation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
