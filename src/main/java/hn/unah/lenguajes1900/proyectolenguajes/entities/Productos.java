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
<<<<<<< HEAD
  
=======
>>>>>>> 0986f3f5c20f4c5d55c7b8c9bd39c24f33d5c6a8

    @Column(name="cantidadstock")
    private long cantidadStock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idcategoria",referencedColumnName = "idcategoria")
    private Categorias categorias;

<<<<<<< HEAD
    @ManyToOne(cascade = CascadeType.ALL)
=======
    @JsonIgnore
    @ManyToOne
>>>>>>> 0986f3f5c20f4c5d55c7b8c9bd39c24f33d5c6a8
    @JoinColumn(name="idusuario", referencedColumnName = "idusuario")
    private Usuarios usuarios;

    @JsonIgnore
    @OneToMany(mappedBy = "productos")
    private List<FacturasDetalle> facturasDetalles;



}
