package hn.unah.lenguajes1900.proyectolenguajes.entities;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pedidos")
@Data
public class Pedidos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedido")
    private long idPedido;

    private String estado;
    private LocalDate fecha;

    @Column(name = "horarecepcion")
    private String horaRecepcion;

    /*@JsonIgnore
    @ManyToOne
    @JoinColumn(name="idusuario",referencedColumnName="idusuario")
    private Usuarios usuarios;*/
    
    
    @OneToOne
    @JoinColumn(name="idfactura", referencedColumnName="idfactura")
    private Facturas facturas;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "pedidos")
    private List<Usuarios> usuarios;
}
