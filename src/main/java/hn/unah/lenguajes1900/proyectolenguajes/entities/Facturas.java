package hn.unah.lenguajes1900.proyectolenguajes.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name="facturas")
@Data
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idfactura")
    private long idFactura;

    @Column(name="numerofactura")
    private long NumeroFactura;

    private LocalDate fecha;
    private String RTN;
    private double ISV15;
    private double total;
    
    @OneToOne
    @JoinColumn(name="idusuario", referencedColumnName = "idusuario")
    private Usuarios usuarios;

    @OneToOne
    @JoinColumn(name="idmetodopago", referencedColumnName="idmetodopago")
    private MetodosPago metodosPago;

    @OneToOne(mappedBy = "facturas")
    private Pedidos pedidos;

    @OneToMany(mappedBy = "facturas")
    private List<FacturasDetalle> facturasDetalle;

    
}
