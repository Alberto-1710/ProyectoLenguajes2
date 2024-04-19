package hn.unah.lenguajes1900.proyectolenguajes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "facturasdetalles")
@Data
public class FacturasDetalles {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfacturadetalle")
    private long idFacturaDetalle;

    private double PrecioUnitario;
    private int cantidad;
    private double importe;

    @ManyToOne
    private Facturas facturas;

    @ManyToOne
    private Productos productos;
}
