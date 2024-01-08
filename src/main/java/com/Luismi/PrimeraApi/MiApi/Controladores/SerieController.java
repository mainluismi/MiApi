package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Servicios.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/series")
public class SerieController {
    private SerieService serieService;

    @Autowired
    public SerieController(SerieService serieService){
        this.serieService = serieService;
    }
}
