package br.com.fiap.wire.controller;

import br.com.fiap.wire.entity.Alerta;
import br.com.fiap.wire.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alerta")
public class AlertaController {
    @Autowired
    private AlertaService alertaService;

    @PostMapping
    public ResponseEntity<Alerta> createAlerta(@RequestBody Alerta alerta) {
        return new ResponseEntity<>(alertaService.createAlerta(alerta), HttpStatus.CREATED);
    }
}