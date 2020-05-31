package isi.CoupeSpring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import isi.CoupeSpring.Entities.*;


@RepositoryRestResource
@CrossOrigin("*")
public interface specRepo extends JpaRepository<Spectateur,Long> {
	@RestResource(path="/byNom")
	public List<Spectateur> findByNomContains(@Param("spec") String spec);
	
}
