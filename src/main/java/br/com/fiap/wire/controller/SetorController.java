package br.com.fiap.wire.controller;
import br.com.fiap.wire.entity.Setor;
import br.com.fiap.wire.service.SetorService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/setor")
public class SetorController {
    @Autowired
    private SetorService setorService;

    @PutMapping("/{id}/responsavel")
    public ResponseEntity<Setor> updateResponsavel(@PathVariable Long id, @RequestBody String responsavel) {
        Setor updatedSetor = setorService.updateResponsavel(id, responsavel);
        return ResponseEntity.ok(updatedSetor);
    }
}