package hn.unah.lenguajes1900.proyectolenguajes.services;



import hn.unah.lenguajes1900.proyectolenguajes.entities.Pedidos;


public interface PedidosService {

    public Pedidos crearPedido(Pedidos pedido);
    public Pedidos agregarUsuarioAPedido (long idpedido,long idusuario);
    
}
