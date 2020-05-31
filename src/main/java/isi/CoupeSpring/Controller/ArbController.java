package isi.CoupeSpring.Controller;

import java.util.List;

import javax.validation.Valid;

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

public class ArbController {
	@Autowired 
	private arbRepo po;
	
	
	
	@GetMapping(value="/listarbitres")
	public List<Arbitre> listarbitres() {
		return po.findAll();
	}
	@GetMapping(value="/listarbitres/{id}")
	public Arbitre listarbitres(@PathVariable(name="id") Long id) {
		return po.findById(id).get();	}
	
	@PostMapping(value="/addarbitre")
	public Arbitre save(@Valid  @RequestBody Arbitre a) {
	    return po.save(a);
	}
	@PutMapping(value="/updatearbitres/{id}")
	public Arbitre update(@PathVariable(name="id") Long id,@RequestBody Arbitre a) {
	   a.setId(id);
		return po.save(a);
	}
	@DeleteMapping(value="/deletearbitres/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
	    po.deleteById(id);
	}
	
	
}
