package hn.unah.lenguajes1900.proyectolenguajes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "direcciones")
@Data
public class Direcciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddireccion")
    private long idDireccion;
    private String pais;
    private String departamento;
    private String municipio;
    private String aldea;
    private String colonia;
    private String referencia;

    @OneToOne(mappedBy = "direcciones")
    private Personas personas;

    
}
