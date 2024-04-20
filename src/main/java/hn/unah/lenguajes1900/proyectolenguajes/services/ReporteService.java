package hn.unah.lenguajes1900.proyectolenguajes.services;

import java.time.LocalDate;
import java.util.List;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;

public interface ReporteService {

    List<Pedidos> obtenerPedidosPorFecha(LocalDate fecha);

    
}
