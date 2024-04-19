package hn.unah.lenguajes1900.proyectolenguajes.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Personas;

@Repository
public interface PersonasRepository extends CrudRepository<Personas, Long> {
    
}
