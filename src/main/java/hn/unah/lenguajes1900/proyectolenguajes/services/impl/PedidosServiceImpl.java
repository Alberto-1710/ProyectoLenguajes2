package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.PedidosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.UsuariosRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.PedidosService;
@Service
public class PedidosServiceImpl implements PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;
    @Autowired
    private UsuariosRepository usuariosRepository;
    @Override
    public Pedidos crearPedido(Pedidos pedido) {
        return this.pedidosRepository.save(pedido);
    
    }
    @Override
    public Pedidos agregarUsuarioAPedido( long idpedido,long idusuario) {
        if(this.pedidosRepository.existsById(idpedido)){
            if(this.usuariosRepository.existsById(idusuario)){
                Pedidos pedido=this.pedidosRepository.findById(idpedido).get();
                pedido.getUsuarios().add(this.usuariosRepository.findById(idusuario).get());
                return pedido;
            }
        }
        return null;
    }

   
}
