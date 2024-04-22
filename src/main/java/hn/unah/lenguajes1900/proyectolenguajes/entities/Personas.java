package hn.unah.lenguajes1900.proyectolenguajes.entities;
import java.util.Date;

import jakarta.persistence.CascadeType;
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
    private String email;
    private String dni;
    private char genero;

    @Column(name = "fechanacimiento")
    private Date fechaNacimiento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="idusuario",referencedColumnName = "idusuario")
    private Usuarios usuarios;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name="iddireccion",referencedColumnName = "iddireccion")
   private Direcciones direcciones;

  
}

