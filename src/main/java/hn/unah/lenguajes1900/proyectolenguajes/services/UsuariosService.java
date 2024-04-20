package hn.unah.lenguajes1900.proyectolenguajes.services;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;

public interface UsuariosService {
    
    public Usuarios crearUsuario(Usuarios usuarios);

    public String validarUsuario(Usuarios usuarios);
    
}
