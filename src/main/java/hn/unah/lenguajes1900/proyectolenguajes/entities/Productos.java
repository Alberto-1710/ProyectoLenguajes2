package hn.unah.lenguajes1900.proyectolenguajes.entities;

import jakarta.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

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


    @Column(name="cantidadstock")
    private long cantidadStock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idcategoria",referencedColumnName = "idcategoria")
    private Categorias categorias;

   
    


    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idusuario", referencedColumnName = "idusuario")
    private Usuarios usuarios;

    @JsonIgnore
    @OneToMany(mappedBy = "productos")
    private List<FacturasDetalle> facturasDetalles;



}
