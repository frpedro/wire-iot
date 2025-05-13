package br.com.fiap.wire.service;

import br.com.fiap.wire.entity.RegistroConsumo;
import br.com.fiap.wire.repository.RegistroConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumoService {
    @Autowired
    private RegistroConsumoRepository consumoRepository;

    public List<RegistroConsumo> getAllConsumos() {
        return consumoRepository.findAll();
    }
}