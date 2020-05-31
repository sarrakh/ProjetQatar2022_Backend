package isi.CoupeSpring.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Spectateur implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private Long id;
	private String nom;
	private int cin;
	private int num_passaport;
	
	
	@ManyToOne 

	Jeu jeus;
	
	
	
	public Jeu getJeus() {
		return jeus;
	}

	public void setJeus(Jeu jeus) {
		this.jeus = jeus;
	}



	public Spectateur() {
		super();
	}


	public Spectateur(Long id, String nom, int cin, int num_passaport, Jeu jeus) {
		super();
		this.id = id;
		this.nom = nom;
		this.cin = cin;
		this.num_passaport = num_passaport;
		this.jeus = jeus;
	}


	@Override
	public String toString() {
		return "Spectateur [id=" + id + ", nom=" + nom + ", cin=" + cin + ", num_passaport=" + num_passaport + ", jeus="
				+ jeus + "]";
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


	public int getNum_passaport() {
		return num_passaport;
	}


	public void setNum_passaport(int num_passaport) {
		this.num_passaport = num_passaport;
	}


	
	
	
	
}
