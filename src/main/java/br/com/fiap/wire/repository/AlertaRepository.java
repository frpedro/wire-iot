package br.com.fiap.wire.repository;

import br.com.fiap.wire.entity.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository<Alerta, Long> {
}
