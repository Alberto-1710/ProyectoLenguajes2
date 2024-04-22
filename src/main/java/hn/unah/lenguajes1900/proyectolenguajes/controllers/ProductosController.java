package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Productos;
import hn.unah.lenguajes1900.proyectolenguajes.services.impl.ProductosServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class ProductosController {
    @Autowired
    private ProductosServiceImpl productosServiceImpl;

    @PostMapping("/producto/crear")
    public Productos crearProducto(@RequestBody Productos productos) {
    return this.productosServiceImpl.crearProducto(productos);
    }
    

}
