package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Facturas;

@Repository
public interface FacturasRepository extends CrudRepository<Facturas,Long> {
    
}
