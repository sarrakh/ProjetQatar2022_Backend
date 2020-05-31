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

public class joController {
	@Autowired 
	private joRepo po;
	
	@GetMapping(value="/listjoueurs")
	public List<Joueur> listjoueurs() {
		return po.findAll();
	}
	@GetMapping(value="/listjoueurs/{id}")
	public Joueur listjoueurs(@PathVariable(name="id") Long id) {
		return po.findById(id).get();	}
	
	@PostMapping(value="/addjoueurs")
	public Joueur save( @RequestBody Joueur a) {
	    return po.save(a);
	}
	@PutMapping(value="/updatejoueurs/{id}")
	public Joueur update(@PathVariable(name="id") Long id,@RequestBody Joueur a) {
	   a.setId(id);
		return po.save(a);
	}
	@DeleteMapping(value="/deletejoueurs/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
	    po.deleteById(id);
	}
	
	
}
