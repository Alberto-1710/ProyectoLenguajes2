package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.PedidosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.PedidosService;
@Service
public class PedidosServiceImpl implements PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;
    @Override
    public Pedidos crearPedido(Pedidos pedido) {
        return this.pedidosRepository.save(pedido);
    
    }
    
}
