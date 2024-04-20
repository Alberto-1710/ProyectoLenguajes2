package hn.unah.lenguajes1900.proyectolenguajes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.lenguajes1900.proyectolenguajes.entities.Personas;
import hn.unah.lenguajes1900.proyectolenguajes.repositories.PersonasRepository;
import hn.unah.lenguajes1900.proyectolenguajes.services.PersonasService;
@Service
public class PersonasServiceImpl implements PersonasService{

    @Autowired
    private PersonasRepository personasRepository;

    @Override
    public Personas crearPersonas(Personas personas) {
       return this.personasRepository.save(personas);
    }
    
}
