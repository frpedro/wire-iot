package br.com.fiap.wire.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "equipamento")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_equipamento")
    private long id;

    private String nome;
    private String tipo;
    private Double consumo_medio_kw;

    @ManyToOne
    @JoinColumn(name = "id_setor")
    private Setor setor;

    // Um equipamento tem vários sensores
    @OneToMany(mappedBy = "equipamento", cascade = CascadeType.ALL)
    private List<SensorIOT> sensores;

    // Um equipamento pode ter vários registros de consumo
    @OneToMany(mappedBy = "equipamento", cascade = CascadeType.ALL)
    private List<RegistroConsumo> registros;

    // Getters e setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getConsumo_medio_kw() {
        return consumo_medio_kw;
    }

    public void setConsumo_medio_kw(Double consumo_medio_kw) {
        this.consumo_medio_kw = consumo_medio_kw;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<SensorIOT> getSensores() {
        return sensores;
    }

    public void setSensores(List<SensorIOT> sensores) {
        this.sensores = sensores;
    }

    public List<RegistroConsumo> getRegistros() {
        return registros;
    }

    public void setRegistros(List<RegistroConsumo> registros) {
        this.registros = registros;
    }
}
