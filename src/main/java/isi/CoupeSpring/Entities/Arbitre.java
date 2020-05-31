package isi.CoupeSpring.Entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Arbitre implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private Long id;
	private String nom;
	private String prenom;
	
	private int cin;
	private int age;
	private String nationnalite;
	

	@ManyToOne 

	Jeu jeus;
	
	
	
	public Jeu getJeus() {
		return jeus;
	}

	public void setJeus(Jeu jeus) {
		this.jeus = jeus;
	}

	public Arbitre() {
		super();
	}

	

	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



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


	public int getCin() {
		return cin;
	}


	public void setCin(int cin) {
		this.cin = cin;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getNationnalite() {
		return nationnalite;
	}


	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}

	public Arbitre(Long id, String nom, String prenom, int cin, int age, String nationnalite, Jeu jeus) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.age = age;
		this.nationnalite = nationnalite;
		this.jeus = jeus;
	}

	@Override
	public String toString() {
		return "Arbitre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", age=" + age
				+ ", nationnalite=" + nationnalite + ", jeus=" + jeus + "]";
	}


	

	
	
	
}

