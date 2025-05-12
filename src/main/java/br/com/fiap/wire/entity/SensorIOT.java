package br.com.fiap.wire.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sensoriot")
public class SensorIOT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor")
    private long id;

    private String tipo_sensor;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_equipamento")
    private Equipamento equipamento;

    // Getters e setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_sensor() {
        return tipo_sensor;
    }

    public void setTipo_sensor(String tipo_sensor) {
        this.tipo_sensor = tipo_sensor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
}
