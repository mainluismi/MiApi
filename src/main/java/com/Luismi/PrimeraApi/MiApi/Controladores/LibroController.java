package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Entidades.Libro;
import com.Luismi.PrimeraApi.MiApi.Servicios.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/libros")
public class LibroController {
    private LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    public List<Libro> listAll(LibroService libroService){
        return libroService.obtenerTodosLosLibros();
    }

    @GetMapping("/")
    @ResponseBody
    public ResponseEntity<List<Libro>> listAll() {
        List<Libro> libros = libroService.obtenerTodosLosLibros();
        return ResponseEntity.ok(libros);
    }

    //@GetMapping("/genero")
    //public ResponseEntity<List<Libro>> listByGenero(){
    //    List<Libro> librosPorGenero = libroService.buscarLibrosPorGenero();
    //    return ResponseEntity.ok(librosPorGenero);
    //}

    @GetMapping("/genero/{nombreGenero}")
    public ResponseEntity<List<Libro>> listByGenero(@PathVariable String nombreGenero) {
        List<Libro> librosPorGenero = libroService.buscarLibrosPorGenero(nombreGenero);
        return ResponseEntity.ok(librosPorGenero);
    }
}
