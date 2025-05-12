package br.com.fiap.wire.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sensoriot")
public class SensorIOT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor")
    public long id;

    public String tipo_sensor;

    public String status;

    public int id_equipamento;

    @OneToMany
    @JoinColumn(name = "id_equipamento")
    public Equipamento equipamento;
}
