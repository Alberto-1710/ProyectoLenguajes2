package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.UsuariosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.UsuariosService;
@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public Usuarios crearUsuario(Usuarios usuarios) {
        return this.usuariosRepository.save(usuarios);
    }

    @Override
    public String validarUsuario(Usuarios usuarios) {
        Usuarios validar = this.usuariosRepository.findByUsuario(usuarios.getUsuario());
        if (validar != null) {
            if(validar.getContrasenia().equals(usuarios.getContrasenia())){
                return "Usuario válido, inicio de sesión exitoso.";    
            }
            return "Contraseña incorrecta";
        }
        return "Usuario no existe";
    }

   
    
    
}
