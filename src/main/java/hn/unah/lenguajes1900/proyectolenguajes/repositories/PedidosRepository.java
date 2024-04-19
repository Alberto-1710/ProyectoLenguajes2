package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;

@Repository
public interface PedidosRepository extends CrudRepository<Pedidos, Long>  {
    
}
