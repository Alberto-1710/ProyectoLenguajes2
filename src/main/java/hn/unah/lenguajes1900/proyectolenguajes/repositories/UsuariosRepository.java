package hn.unah.lenguajes1900.proyectolenguajes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Usuarios;


@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Long> {

    public Usuarios findByUsuario(String usuario);
    
}
