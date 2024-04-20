package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class HomeController {
    
    @GetMapping("/home/{nombre}")
    public String home(@PathVariable String nombre) {      
        return "Hola: " + nombre;
    }
    

}
