package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;

@Repository
public interface PedidosRepository extends CrudRepository<Pedidos, Long>  {
    List<Pedidos> findByFecha(LocalDate fecha);
}
