package hn.unah.lenguajes1900.proyectolenguajes.entities;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="metodospago")
@Data
public class MetodosPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmetodopago")
    private long idMetodoPago;

    private String nombre;

    @OneToOne(mappedBy = "metodosPago")
    private Facturas facturas;



}
