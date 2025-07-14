package com.curso.spring.app1.springboot_applications.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.spring.app1.springboot_applications.models.Empleados;


@Controller
public class EjemploController {
    
    @GetMapping("/detalles_info")

    public String info(Model model) {
        
        Empleados empleado1 = new Empleados("Chester","Cortes", null, "Gerente", 35, 123456789, 001);
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}
