package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.PedidosRepository;




import hn.unah.lenguajes1900.proyectolenguajes.services.ReporteService;

@Service
public class ReporteServiceImpl implements ReporteService {
    @Autowired
    private  PedidosRepository pedidosRepository;

    public ReporteServiceImpl(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    @Override
    public List<Pedidos> obtenerPedidosPorFecha(LocalDate fecha) {
        return pedidosRepository.findByFecha(fecha);
    }
}