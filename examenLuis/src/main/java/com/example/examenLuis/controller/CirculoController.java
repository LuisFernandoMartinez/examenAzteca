package com.example.examenLuis.controller;

import com.example.examenLuis.entity.CirculoEntity;
import com.example.examenLuis.service.CirculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CirculoController {

    @Autowired
    private CirculoService circuloService;

    @PostMapping("/tutorials")
    public ResponseEntity<CirculoEntity> createTutorial(@RequestBody CirculoEntity circulo) {
        try {
            circuloService.saveGeneralDataCircle(circulo);
            CirculoEntity _circulo=new CirculoEntity(circulo.getRadio(),circulo.getColor());
            return new ResponseEntity<>(_circulo, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
