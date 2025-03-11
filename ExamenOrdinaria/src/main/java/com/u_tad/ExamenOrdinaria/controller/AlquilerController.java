package com.u_tad.ExamenOrdinaria.controller;

import com.u_tad.ExamenOrdinaria.model.Alquiler;
import com.u_tad.ExamenOrdinaria.model.Coche;
import com.u_tad.ExamenOrdinaria.service.AlquilerService;
import com.u_tad.ExamenOrdinaria.service.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v2.1/rentals")
public class AlquilerController {
    private final AlquilerService alquilerService;
    private CocheService cocheService;

    @Autowired
    public AlquilerController(AlquilerService alquilerService) {
        this.alquilerService = alquilerService;
    }

    @PostMapping
    public ResponseEntity<Alquiler> save(@RequestBody Alquiler alquiler, Long idCoche) {
        Optional<Coche> coche = cocheService.getCocheById(idCoche);
        if (coche.get().getAvailable()) {
            Alquiler alquilerNew = alquilerService.saveOrUpdate(alquiler);
            return ResponseEntity.ok(alquilerNew);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
