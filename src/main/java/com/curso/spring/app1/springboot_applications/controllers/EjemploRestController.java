package com.curso.spring.app1.springboot_applications.controllers;

// import java.util.HashMap;
// import java.util.Map;

// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import com.curso.spring.app1.springboot_applications.models.Empleados;
import com.curso.spring.app1.springboot_applications.models.dto.ClaseDTO;





@RestController
@RequestMapping("/api")
public class EjemploRestController {
    
    @GetMapping(path="/detalles_info2")

    // public Map<String, Object> detalles_info2() {
    //     Empleados empleado1 = new Empleados("Chester","Cortes", "San Bernarbeu", "Gerente", 35, 123456789, 001);

    //     Map<String, Object> respuesta = new HashMap<>();
    //     respuesta.put("Empleado", "Datos del Empleado");
    //     respuesta.put("Información", empleado1);
    //     return respuesta;
    // }

     public ClaseDTO detalles_info2() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Claudio Lopez");
        return usuario1;
    }
}
