package br.com.fiap.wire.service;

import br.com.fiap.wire.entity.Equipamento;
import br.com.fiap.wire.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipamentoService {
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public List<Equipamento> getAllEquipamentos() {
        return equipamentoRepository.findAll();
    }
}