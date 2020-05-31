package isi.CoupeSpring.Controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import isi.CoupeSpring.Entities.*;
import isi.CoupeSpring.Repository.*;

@CrossOrigin("*")
@RestController

public class JeuController {
	@Autowired 
	private jeuRepo po;
	
	@GetMapping(value="/listjeus")
	public List<Jeu> listjeus() {
		return po.findAll();
	}
	@GetMapping(value="/listjeus/{id}")
	public Jeu listjeus(@PathVariable(name="id") Long id) {
		return po.findById(id).get();	}
	
	@PostMapping(value="/addjeus")
	public Jeu save( @RequestBody Jeu a) {
	    return po.save(a);
	}
	@PutMapping(value="/updatejeus/{id}")
	public Jeu update(@PathVariable(name="id") Long id,@RequestBody Jeu a) {
	   a.setId(id);
		return po.save(a);
	}
	@DeleteMapping(value="/deletejeus/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
	    po.deleteById(id);
	}
	
	
}
