package hn.unah.lenguajes1900.proyectolenguajes.entities;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "personas")
@Data
public class Personas {
   
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private long idPersona;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String correo;
    private String dni;
    private String genero;
    private Date fechaNacimineto;

   @OneToOne
   @JoinColumn(name="idireccion",referencedColumnName = "iddireccion")
   private Direcciones direcciones;

   @OneToOne
   @JoinColumn(name="idusuario",referencedColumnName = "idusuario")
   private Usuarios usuarios;

}

