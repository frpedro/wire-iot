package br.com.fiap.wire.service;

import br.com.fiap.wire.entity.Setor;
import br.com.fiap.wire.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetorService {
    @Autowired
    private SetorRepository setorRepository;

    public Setor updateResponsavel(Long id, String responsavel) {
        Setor setor = setorRepository.findById(id).orElseThrow(() -> new RuntimeException("Setor não encontrado"));
        setor.setResponsavel(responsavel);
        return setorRepository.save(setor);
    }
}
