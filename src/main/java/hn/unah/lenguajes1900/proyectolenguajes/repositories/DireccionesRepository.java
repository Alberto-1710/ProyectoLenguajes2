package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Direcciones;

@Repository
public interface DireccionesRepository extends CrudRepository<Direcciones, Long> {
    
}
