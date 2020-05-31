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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Jeu  implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private Long id;
	private String lieu;
	private float duree;
	private double espace;
	
	@JsonIgnore
	@OneToMany(mappedBy="jeus",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Spectateur> spectateurs;

	@JsonIgnore
	@OneToMany(mappedBy="jeus",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Arbitre> arbitres;
	
	@JsonIgnore
	@OneToMany(mappedBy="jeus",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Equipe> equipes;

	
	
	
	public Set<Arbitre> getArbitres() {
		return arbitres;
	}

	public void setArbitres(Set<Arbitre> arbitres) {
		this.arbitres = arbitres;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public double getEspace() {
		return espace;
	}

	public void setEspace(double espace) {
		this.espace = espace;
	}

	public Set<Spectateur> getSpectateurs() {
		return spectateurs;
	}

	public void setSpectateurs(Set<Spectateur> spectateurs) {
		this.spectateurs = spectateurs;
	}

	public Set<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(Set<Equipe> equipes) {
		this.equipes = equipes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Jeu [id=" + id + ", lieu=" + lieu + ", duree=" + duree + ", espace=" + espace + ", spectateurs="
				+ spectateurs + ", arbitres=" + arbitres + ", equipes=" + equipes + "]";
	}

	public Jeu(Long id, String lieu, float duree, double espace, Set<Spectateur> spectateurs, Set<Arbitre> arbitres,
			Set<Equipe> equipes) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.duree = duree;
		this.espace = espace;
		this.spectateurs = spectateurs;
		this.arbitres = arbitres;
		this.equipes = equipes;
	}

	public Jeu() {
		super();
	}

	

	

	
	
	
	

}
