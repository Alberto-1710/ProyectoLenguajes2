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

    @Column(name = "primernombre")
    private String primerNombre;

    @Column(name = "segundonombre")
    private String segundoNombre;

    @Column(name = "primerapellido")
    private String primerApellido;

    @Column(name = "segundoapellido")
    private String segundoApellido;

    private String telefono;
    private String correo;
    private String dni;
    private String genero;

    @Column(name = "fechanacimiento")
    private Date fechaNacimineto;

    @OneToOne
    @JoinColumn(name="idusuario",referencedColumnName = "idusuario")
    private Usuarios usuarios;

   @OneToOne
   @JoinColumn(name="iddireccion",referencedColumnName = "iddireccion")
   private Direcciones direcciones;

  
}

