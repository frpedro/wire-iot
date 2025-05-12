package br.com.fiap.wire.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "equipamento")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipamento")

    public long id;

    public String nome;

    public String tipo;

    public Double consumo_medio_kw;

    @ManyToOne
    @JoinColumn(name = "id_setor")
    private Setor setor;

    @OneToMany(mappedBy = "equipamento", cascade = CascadeType.ALL)
    private List<Equipamento> equipamentos;

}


