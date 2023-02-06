package com.university.management.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

 
@Entity
public class User 
{ 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
	@Column(name = "first_name")
  private String firstName;
	@Column(name = "last_name")
  private String lastName; 
	@Column(name = "date_naissance")
  private Date dateNaissance;
	@Column(name = "gender")
  private String gender;
    @Column(unique=true)
  private String email;
    @Column(name = "type")
  private String type;
    @Column(name = "password")
  private String password;
  
@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", "
			+ "dateNaissance=" + dateNaissance + ", gender=" + gender + ", email="			
			+ email + ", type=" + type + ", passeword=" + password + "]";
}

public int getId() {
	return id;
}

public void setId(int id) {
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

public Date getDateNaissance() {
	return dateNaissance;
}

public void setDateNaissance(Date dateNaissance) {
	this.dateNaissance = dateNaissance;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
  
  
}