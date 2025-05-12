package br.com.fiap.wire.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "registroconsumo")
public class RegistroConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    private long id;

    private Date data_hora;
    private Double consumo_kw;

    @ManyToOne
    @JoinColumn(name = "id_equipamento")
    private Equipamento equipamento;

    // Um registro pode ter vários alertas
    @OneToMany(mappedBy = "registroConsumo", cascade = CascadeType.ALL)
    private List<Alerta> alertas;

    // Getters e setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public Double getConsumo_kw() {
        return consumo_kw;
    }

    public void setConsumo_kw(Double consumo_kw) {
        this.consumo_kw = consumo_kw;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public List<Alerta> getAlertas() {
        return alertas;
    }

    public void setAlertas(List<Alerta> alertas) {
        this.alertas = alertas;
    }
}
