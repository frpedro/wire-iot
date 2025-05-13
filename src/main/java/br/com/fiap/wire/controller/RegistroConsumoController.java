package br.com.fiap.wire.controller;

import br.com.fiap.wire.entity.RegistroConsumo;
import br.com.fiap.wire.service.ConsumoService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumo")
public class RegistroConsumoController {
    @Autowired
    private ConsumoService consumoService;

    @GetMapping
    public ResponseEntity<List<RegistroConsumo>> getConsumos() {
        return ResponseEntity.ok(consumoService.getAllConsumos());
    }
}