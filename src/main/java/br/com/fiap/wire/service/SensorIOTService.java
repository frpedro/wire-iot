package br.com.fiap.wire.service;

import br.com.fiap.wire.entity.SensorIOT;
import br.com.fiap.wire.repository.SensorIOTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorIOTService {
    @Autowired
    private SensorIOTRepository sensoriotRepository;

    public SensorIOT getStatus() {
        return sensoriotRepository.findAll().get(0);
    }
}