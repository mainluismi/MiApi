package com.Luismi.PrimeraApi.MiApi.Servicios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Pelicula;
import com.Luismi.PrimeraApi.MiApi.Repositorios.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaService {
    @Autowired
    private final PeliculaRepository peliculaRepository;

    public PeliculaService(PeliculaRepository peliculaRepository) {
        this.peliculaRepository = peliculaRepository;
    }

    public Pelicula guardarPelicula(Pelicula pelicula){
        return peliculaRepository.save(pelicula);
    }

    public List<Pelicula> obtenerTodasLasPeliculas(){
        return peliculaRepository.findAll();
    }

    public List<Pelicula> obtenerPeliculaPorGenero(String genero){
        return peliculaRepository.findByGenero(genero);
    }

    public Pelicula obtenerPeliculaPorId(Long id){
        return peliculaRepository.findById(id).orElse(null);
    }
}
