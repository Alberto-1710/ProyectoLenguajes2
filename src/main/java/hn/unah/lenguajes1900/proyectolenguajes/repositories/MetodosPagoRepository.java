package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.MetodosPago;

@Repository
public interface MetodosPagoRepository extends CrudRepository<MetodosPago, Long> {
    
}
