package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Roles;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.RolesRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.RolesService;
@Service
public class RolesServiceImpl implements RolesService {

@Autowired
private RolesRepository rolesRepository;


    @Override
    public Roles crearRol(Roles roles) {
        return this.rolesRepository.save(roles);
    }
    
}
