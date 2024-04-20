package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.services.impl.PedidosServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class PedidosController {
     @Autowired
    private PedidosServiceImpl pedidosServiceImpl;

    @PostMapping("/pedido/crear")
    public Pedidos crearPedido(@RequestBody Pedidos pedido) {
        return this.pedidosServiceImpl.crearPedido(pedido);
    }
    
}
