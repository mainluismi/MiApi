package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Entidades.Pelicula;
import com.Luismi.PrimeraApi.MiApi.Servicios.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    private PeliculaService peliculaService;

    @Autowired
    public  PeliculaController(PeliculaService peliculaService){
        this.peliculaService = peliculaService;
    }

    public List<Pelicula> listAll(PeliculaService peliculaService){
        return peliculaService.obtenerTodasLasPeliculas();
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<List<Pelicula>> listAll(){
        List<Pelicula> peliculas = peliculaService.obtenerTodasLasPeliculas();
        return ResponseEntity.ok(peliculas);
    }

    @GetMapping("/genero/{nombreGenero}")
    @ResponseBody
    public ResponseEntity<List<Pelicula>> listByGenero(@PathVariable String nombreGenero){
        List<Pelicula> peliculasPorGenero = peliculaService.obtenerPeliculaPorGenero(nombreGenero);
        return ResponseEntity.ok(peliculasPorGenero);
    }

}
