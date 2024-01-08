package com.Luismi.PrimeraApi.MiApi.Servicios;

import com.Luismi.PrimeraApi.MiApi.Repositorios.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {
    @Autowired
    private final SerieRepository serieRepository;

    public SerieService(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }
}
