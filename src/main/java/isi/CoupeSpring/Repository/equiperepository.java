package isi.CoupeSpring.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import isi.CoupeSpring.Entities.Equipe;



@CrossOrigin("*")
@RepositoryRestResource
public interface equiperepository extends JpaRepository<Equipe,Long> {


}




