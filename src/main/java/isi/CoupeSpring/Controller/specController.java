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

public class specController {
	@Autowired 
	private specRepo po;
	
	@GetMapping(value="/listspectateurs")
	public List<Spectateur> listspectateurs() {
		return po.findAll();
	}
	
	@GetMapping(value="/listspectateurs/{id}")
	public Spectateur listspectateurs(@PathVariable(name="id") Long id) {
		return po.findById(id).get();	
		}
	
	@PostMapping(value="/addspectateurs")
	public Spectateur save(@Valid  @RequestBody Spectateur a) {
	    return po.save(a);
	}
	@PutMapping(value="/updatespectateurs/{id}")
	public Spectateur update(@PathVariable(name="id") Long id,@RequestBody Spectateur a) {
	   a.setId(id);
		return po.save(a);
	}
	@DeleteMapping(value="/deletespectateurs/{id}")
	public void  delete(@PathVariable(name="id") Long id) {
	    po.deleteById(id);
	}
	
	
}
