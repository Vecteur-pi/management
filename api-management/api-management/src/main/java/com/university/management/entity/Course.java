package com.university.management.entity;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private String id;
  private String matiere; 
  @ManyToOne
  @JoinColumn(name="instructor_id", nullable=false)
  private User instructeur;

  private Date date;
  @ManyToOne
  @JoinColumn(name="salle_id", nullable=false)
  private Salle salle;
   
@Override
public String toString() {
	return "Course [id=" + id + ", matiere=" + matiere + ", instructeur=" + instructeur.getFirstName() + ", date=" + date + ", salle=" + salle + "]";
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getMatiere() {
	return matiere;
}

public void setMatiere(String matiere) {
	this.matiere = matiere;
}


public User getInstructeur() {
	return instructeur;
}

public void setInstructeur(User instructeur) {
	this.instructeur = instructeur;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Salle getSalle() {
	return salle;
}

public void setSalle(Salle salle) {
	this.salle = salle;
}

}
