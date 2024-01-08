package com.Luismi.PrimeraApi.MiApi.Repositorios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula,Long> {
}
