package com.Luismi.PrimeraApi.MiApi.Repositorios;

import com.Luismi.PrimeraApi.MiApi.Entidades.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Long> {
    public List<Serie> findAll();
    public Serie findById(long id);
}
