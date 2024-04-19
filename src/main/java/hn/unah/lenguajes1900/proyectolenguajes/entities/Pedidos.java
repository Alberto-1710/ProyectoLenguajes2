package hn.unah.lenguajes1900.proyectolenguajes.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "direcciones")
@Data
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedido")
    private long idPedido;
    private String estado;
    private LocalDate fecha;
    private String horaRecepcion;

    @ManyToOne
    private Usuarios usuarios;
    
    @OneToOne
    @JoinColumn(name="idfactura", referencedColumnName="idfactura")
    private Facturas facturas;

    @ManyToOne
    private VendedorPedidos vendedorPedidos;

}
