package br.com.fiap.wire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class SensorIOTController {

    @GetMapping("/status")
    public String pegarStatus() {
        return  "Ativo";
    }
}
