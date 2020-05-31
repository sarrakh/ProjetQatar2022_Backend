package isi.CoupeSpring.Entities;
import java.io.Serializable;
import java.util.List;
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


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;


import isi.CoupeSpring.Entities.Joueur;


@Entity
public class Equipe implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	
	private long id;
	private String nom;
	private Integer effectif;
	
	@JsonIgnore
	@OneToMany(mappedBy="equipes",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Joueur> joueurs ;
	
	
	@ManyToOne 

	Jeu jeus;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getEffectif() {
		return effectif;
	}
	public void setEffectif(Integer effectif) {
		this.effectif = effectif;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	public Set<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Set<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	@Override
	public String toString() {
		return "Equipe [id=" + id + ", nom=" + nom + ", effectif=" + effectif + ", joueurs=" + joueurs + ", jeus="
				+ jeus + "]";
	}
	public Equipe(long id, String nom, Integer effectif, Set<Joueur> joueurs, Jeu jeus) {
		super();
		this.id = id;
		this.nom = nom;
		this.effectif = effectif;
		this.joueurs = joueurs;
		this.jeus = jeus;
	}
	public Jeu getJeus() {
		return jeus;
	}
	public void setJeus(Jeu jeus) {
		this.jeus = jeus;
	}
	public Equipe() {
		super();
	}
	

	
}

	