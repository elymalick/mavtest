package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employe implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String nom;
private String prenom;
private String dateEmbauche;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getDateEmbauche() {
	return dateEmbauche;
}
public void setDateEmbauche(String dateEmbauche) {
	this.dateEmbauche = dateEmbauche;
}

}
