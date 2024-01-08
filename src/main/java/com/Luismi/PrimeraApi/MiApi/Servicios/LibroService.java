package com.Luismi.PrimeraApi.MiApi.Servicios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Libro;
import com.Luismi.PrimeraApi.MiApi.Repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro guardarLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

    public Libro obtenerLibroPorId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }

    public List<Libro> buscarLibrosPorGenero(String genero) {
        return libroRepository.findByGenero(genero);
    }

    public List<Libro> buscarLibrosPorDirector(String director) {
        return libroRepository.findByDirector(director);
    }

}
