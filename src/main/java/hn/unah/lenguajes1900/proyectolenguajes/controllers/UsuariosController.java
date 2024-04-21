package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;
import hn.unah.lenguajes1900.proyectolenguajes.services.impl.UsuariosServiceImpl;

@RestController
@RequestMapping("/api")
public class UsuariosController {

    @Autowired
    private UsuariosServiceImpl usuariosServiceImpl;

    @PostMapping("/usuario/crear")
    public Usuarios crearUsuarios(@RequestBody Usuarios usuarios){
        return this.usuariosServiceImpl.crearUsuario(usuarios);
    }

    @PostMapping("/usuario/login")
    public ResponseEntity<String> validarUsuario(@RequestBody Usuarios usuarios) {
        ResponseEntity<String> response = usuariosServiceImpl.validarUsuario(usuarios);
        return response;
    }

    
    
}
