package hn.unah.lenguajes1900.proyectolenguajes.services;

import org.springframework.http.ResponseEntity;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;

public interface UsuariosService {
    
    public Usuarios crearUsuario(Usuarios usuarios);

    public ResponseEntity<String> validarUsuario(Usuarios usuarios);
    
}
