package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Servicios.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/peliculas")
public class PeliculaController {
    private PeliculaService peliculaService;

    @Autowired
    public  PeliculaController(PeliculaService peliculaService){
        this.peliculaService = peliculaService;
    }
}
