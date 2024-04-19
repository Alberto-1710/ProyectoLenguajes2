package hn.unah.lenguajes1900.proyectolenguajes.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuarios")
@Data
public class Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private long idUsuario;

    private String usuario;
    private String contrasenia;

@OneToOne(mappedBy = "usuarios")
private Personas personas;

/*@OneToOne
private VendedorPedidos vendedorPedidos;*/

@OneToMany(mappedBy = "usuarios")
private List<Productos> productos;
    
@OneToMany(mappedBy = "usuarios")
private List<Pedidos> pedidos;

@OneToOne(mappedBy = "usuarios")
private Facturas facturas;
}

