package br.com.fiap.wire.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "setor")
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    public long id;

    public String tipo_alerta;

    public String descricao;

    public Date data_hora;

    @OneToMany(mappedBy = "setor", cascade = CascadeType.ALL)
    private List<Equipamento> equipamentos;

}
