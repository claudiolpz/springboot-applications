package com.curso.spring.app1.springboot_applications.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.app1.springboot_applications.models.Empleados;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
    @GetMapping(path="/detalles_info2")
    // @RequestMapping(path="/detalles_info2", method=RequestMethod.GET)

    public Map<String, Object> detalles_info2() {
        Empleados empleado1 = new Empleados("Chester","Cortes", "San Bernarbeu", "Gerente", 35, 123456789, 001);


        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos del Empleado");
        respuesta.put("Información", empleado1);
        return respuesta;
    }
}
