package com.Luismi.PrimeraApi.MiApi.Repositorios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {
    public List<Pelicula> findAll();
    public Pelicula findById(long id);
    List <Pelicula> findByGenero(String genero);
    List <Pelicula> findByDirector(String director);

}
