package br.com.fiap.wire.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "registroconsumo")
public class RegistroConsumo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_registro")
    public long id;

    public Date data_hora;

    public Double consumo_kw;

    @OneToMany


}
