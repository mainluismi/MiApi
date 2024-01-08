package com.Luismi.PrimeraApi.MiApi.Repositorios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Long> {
    public Libro add(Libro libro);
    public List<Libro> findAll();
    public Libro findById(long id);
    List<Libro> findByGenero(String genero);
    List<Libro> findByDirector(String director);
    List<Libro> findByValoracionGreaterThanEqual(Double valoracion);
}
