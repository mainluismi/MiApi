package com.Luismi.PrimeraApi.MiApi.Repositorios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Long> {
}
