package hn.unah.lenguajes1900.proyectolenguajes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class HomeController {
    
    @PostMapping("/home")
    public String home(@PathVariable String nombre) {      
        return "Hola: ";
    }
    

}
