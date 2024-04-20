package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Productos;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.ProductosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.ProductosService;
@Service
public class ProductosServiceImpl implements ProductosService {
    
    @Autowired
    private ProductosRepository productosRepository;

   

    @Override
    public Productos crearProducto(Productos productos) {
        return this.productosRepository.save(productos);
    }
    
}
