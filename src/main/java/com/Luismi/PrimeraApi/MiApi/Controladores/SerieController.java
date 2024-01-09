package com.Luismi.PrimeraApi.MiApi.Controladores;

import com.Luismi.PrimeraApi.MiApi.Entidades.Serie;
import com.Luismi.PrimeraApi.MiApi.Servicios.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/series")
public class SerieController {
    private SerieService serieService;

    @Autowired
    public SerieController(SerieService serieService){
        this.serieService = serieService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Serie>> listAll(){
        List<Serie> series = serieService.obtenerTodasLasSeries();
        return ResponseEntity.ok(series);
    }
}
