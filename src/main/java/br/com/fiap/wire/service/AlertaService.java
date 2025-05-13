package br.com.fiap.wire.service;

import br.com.fiap.wire.entity.Alerta;
import br.com.fiap.wire.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlertaService {
    @Autowired
    private AlertaRepository alertaRepository;

    public Alerta createAlerta(Alerta alerta) {
        return alertaRepository.save(alerta);
    }
}