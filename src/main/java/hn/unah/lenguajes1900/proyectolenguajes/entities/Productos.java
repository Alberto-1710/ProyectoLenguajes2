package hn.unah.lenguajes1900.proyectolenguajes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name="productos")
@Data
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private  long idProducto;
    private  String nombre;
    private  double precio;
    private  String descripcion;
    private  String codigo;
    private double impuesto;
    @Column(name="cantidadstock")
    private long cantidadStock;

    @OneToOne
    @JoinColumn(name="idcategoria",referencedColumnName = "idcategoria")
    private Categorias categorias;

    @ManyToOne
    private Usuarios usuarios;

    @OneToMany
    private List<FacturasDetalles> facturasDetalles;



}
