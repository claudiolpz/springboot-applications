package com.curso.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EjemploRestController {
    
    @GetMapping("/detalles_info2")

    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("titulo", "Servidor en Linea");
        respuesta.put("Servidor", "Claudio Lopez");
        respuesta.put("Magallanes", "El Primer Grande");
        return respuesta;
    }
}
