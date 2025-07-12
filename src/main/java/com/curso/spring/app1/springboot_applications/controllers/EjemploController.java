package com.curso.spring.app1.springboot_applications.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")

    public String info(Map<String, Object> modelo) {
        modelo.put("titulo", "Servidor en Linea");
        modelo.put("Servidor", "Claudio Lopez");
        modelo.put("Magallanes", "El Primer Grande");
        return "detalles_info";
    }
}
