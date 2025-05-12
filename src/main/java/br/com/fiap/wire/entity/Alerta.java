package br.com.fiap.wire.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "alerta")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    public long id;

    public String tipo_alerta;

    public String descricao;

    public Date data_hora;

    @ManyToOne
    @JoinColumn(name = "id_registro")
    private int registro;
}
