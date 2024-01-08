package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Servicios.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/libros")
public class LibroController {
    private LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

}
