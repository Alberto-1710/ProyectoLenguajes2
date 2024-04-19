package hn.unah.lenguajes1900.proyectolenguajes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "vendedorpedidos")
@Data
public class VendedorPedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvendedorpedidos")
    private long idVendedorPedido; 

    @OneToOne
    private Usuarios usuarios;

    @OneToMany
    private List<Pedidos> pedidos;
}
