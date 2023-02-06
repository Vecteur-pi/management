package com.university.management.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  private String nom;
  private int nombreDePlaces;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNombreDePlaces() {
	return nombreDePlaces;
}
public void setNombreDePlaces(int nombreDePlaces) {
	this.nombreDePlaces = nombreDePlaces;
}
   
}