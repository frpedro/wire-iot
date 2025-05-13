package br.com.fiap.wire.controller;

import br.com.fiap.wire.entity.SensorIOT;
import br.com.fiap.wire.service.SensorIOTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensoriot")
public class SensorIOTController {
    @Autowired
    private SensorIOTService sensoriotService;

    @GetMapping("/status")
    public ResponseEntity<SensorIOT> getStatus() {
        return ResponseEntity.ok(sensoriotService.getStatus());
    }
}