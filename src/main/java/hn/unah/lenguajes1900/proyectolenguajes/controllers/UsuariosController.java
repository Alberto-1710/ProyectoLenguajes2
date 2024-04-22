package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
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

    @GetMapping("/usuario/pedido")
public List<Pedidos> obtenerPedidosdeUsuario(@RequestParam long idusuario) {
    Usuarios usuario = usuariosServiceImpl.obtenerUsuarioPorId(idusuario);
    if (usuario != null) {
        return usuario.getPedidos();
    } else {
        return new ArrayList<>(); // Devolver una lista vacía si el usuario no existe
    }
}

    
}
