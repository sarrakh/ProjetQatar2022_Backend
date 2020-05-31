package isi.CoupeSpring.Controller;

import java.util.List;


import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import isi.CoupeSpring.Entities.Arbitre;
import isi.CoupeSpring.Entities.Equipe;
import isi.CoupeSpring.Repository.equiperepository;


@CrossOrigin("*")
@RestController
public class equipescontroller {

	@Autowired 
	 
	private equiperepository pserv ;
	
	
	@GetMapping(value="/listequipe")
	public List<Equipe> listequipe() {
		return pserv.findAll();
	}
	
	@PostMapping("/addequipes")
	public Equipe createEquipes(@Valid @RequestBody Equipe equipe) {
	    return pserv.save(equipe);
	
	}
	@GetMapping(value="/getequipes/{id}")
	public Equipe listeEquipe(@PathVariable(name="id") Long id) {
		return pserv.findById(id).get();	}
	
	@PutMapping(value="/updateequipe/{id}")
	public Equipe update(@PathVariable(name="id") Long id,@RequestBody Equipe a) {
	   a.setId(id);
		return pserv.save(a);
	}
	@DeleteMapping(value="/deleteequipe/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
		pserv.deleteById(id);
	}
	
	
	
}






