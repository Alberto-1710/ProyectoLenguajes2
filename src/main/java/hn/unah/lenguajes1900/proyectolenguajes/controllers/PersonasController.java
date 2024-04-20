package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Personas;
import hn.unah.lenguajes1900.proyectolenguajes.services.impl.PersonasServiceImpl;

@RestController
@RequestMapping("/api")
public class PersonasController {
    
    @Autowired
    private PersonasServiceImpl personasServiceImpl;


    @PostMapping("/persona/crear")
    public Personas crearUsuarios(@RequestBody Personas personas){
        return this.personasServiceImpl.crearPersonas(personas);
    }
}
