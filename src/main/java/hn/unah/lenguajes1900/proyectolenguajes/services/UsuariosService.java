package hn.unah.lenguajes1900.proyectolenguajes.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;

public interface UsuariosService {
    
    public Usuarios crearUsuario(Usuarios usuarios);

    public ResponseEntity<String> validarUsuario(Usuarios usuarios);
    
    public List<Usuarios> obtenerUsuarios();
    
    public Usuarios agregarPedidoUsuario (long idusuario,long idpedido);
    public Usuarios agregarRolUsuario(long idusuario,long idrol);
    public List<Pedidos> obtenerPedidosdeUsuario (long usuario);
}
