package br.com.fiap.wire.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alerta")
public class Alerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alerta")
    private long id;

    private String tipo_alerta;
    private String descricao;
    private Date data_hora;

    @ManyToOne
    @JoinColumn(name = "id_registro")
    private RegistroConsumo registroConsumo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo_alerta() {
        return tipo_alerta;
    }

    public void setTipo_alerta(String tipo_alerta) {
        this.tipo_alerta = tipo_alerta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public RegistroConsumo getRegistroConsumo() {
        return registroConsumo;
    }

    public void setRegistroConsumo(RegistroConsumo registroConsumo) {
        this.registroConsumo = registroConsumo;
    }
}
