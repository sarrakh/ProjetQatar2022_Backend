package isi.CoupeSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import isi.CoupeSpring.Entities.*;



import isi.CoupeSpring.Repository.*;

@SpringBootApplication
public class CoupeSpringApplication implements CommandLineRunner {
	 
	   
	   @Autowired
	 	private RepositoryRestConfiguration restconfig;

	public static void main(String[] args) {
		SpringApplication.run(CoupeSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restconfig.exposeIdsFor(Joueur.class);
		restconfig.exposeIdsFor(Jeu.class);
		restconfig.exposeIdsFor(Arbitre.class);
		restconfig.exposeIdsFor(Spectateur.class);
		restconfig.exposeIdsFor(Equipe.class);
		
		 
		
	}
	
	
		
}
