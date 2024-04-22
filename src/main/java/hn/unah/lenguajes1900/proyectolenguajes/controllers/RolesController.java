package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Roles;
import hn.unah.lenguajes1900.proyectolenguajes.services.impl.RolesServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class RolesController {

    @Autowired
    private RolesServiceImpl rolesServiceImpl;
    @PostMapping("/rol/crear")
    public Roles crearRol(@RequestBody Roles roles) {
        return this.rolesServiceImpl.crearRol(roles);
    }
    

}
