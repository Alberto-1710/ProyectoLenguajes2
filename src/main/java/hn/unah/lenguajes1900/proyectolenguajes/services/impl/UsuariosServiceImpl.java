package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.PedidosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.RolesRepository;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.UsuariosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.UsuariosService;
@Service
public class UsuariosServiceImpl implements UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;
    @Autowired
    private PedidosRepository pedidosRepository;
    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Usuarios crearUsuario(Usuarios usuarios) {
        return this.usuariosRepository.save(usuarios);
    }

    @Override
    public ResponseEntity<String> validarUsuario(Usuarios usuarios) {
        Usuarios validar = this.usuariosRepository.findByUsuario(usuarios.getUsuario());
        if (validar != null) {
            if(validar.getContrasenia().equals(usuarios.getContrasenia())){
                return ResponseEntity.ok("Usuario válido, inicio de sesión exitoso.");    
            }
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Contraseña incorrecta");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no existe");
    }

    @Override
    public List<Usuarios> obtenerUsuarios() {
     return (List<Usuarios>) this.usuariosRepository.findAll();
    }

    @Override
    public Usuarios agregarPedidoUsuario(long idusuario, long idpedido) {
        if(this.usuariosRepository.existsById(idusuario)){
            if(this.pedidosRepository.existsById(idpedido)){
                Usuarios usuario=this.usuariosRepository.findById(idusuario).get();
                usuario.getPedidos().add(this.pedidosRepository.findById(idpedido).get());
                return usuario;
            }
        }
        return null;
    }

    public Usuarios agregarRolUsuario(long idusuario,long idrol){
        if(this.usuariosRepository.existsById(idusuario)){
            if(this.rolesRepository.existsById(idrol)){
                Usuarios usuario=this.usuariosRepository.findById(idusuario).get();
                usuario.getRoles().add(this.rolesRepository.findById(idrol).get());
                return usuario;
            }
        }
        return null;
    }

    @Override
    public List<Pedidos> obtenerPedidosdeUsuario(long idusuario) {
        if(this.usuariosRepository.existsById(idusuario)){
           return this.usuariosRepository.findById(idusuario).get().getPedidos();
       }
       return null;

    }

   
    
    
}
