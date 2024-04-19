package hn.unah.lenguajes1900.proyectolenguajes.entities;

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
@Table(name = "facturasdetalle")
@Data
public class FacturasDetalle {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfacturadetalle")
    private long idFacturaDetalle;

    @Column(name = "preciounitario")
    private double PrecioUnitario;

    private int cantidad;

    private double importe;

    @OneToOne
    @JoinColumn(name = "idfactura", referencedColumnName = "idfactura")
    private Facturas facturas;

    @ManyToOne
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    private Productos productos;
}
