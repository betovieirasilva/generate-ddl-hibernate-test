package com.beto.ddl.test.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "municipios")
public class Municipio implements Serializable {
    
    @Id
    private Long id;

    @NotEmpty
    @NotNull
    @Column(name = "nome", length = 255)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_id", foreignKey = @ForeignKey(name = "fk_municipios_estado"))
    private Estado estado;

    @Column(name = "cep", length = 9)
    private String cep;

    @Column(name = "cod_ibge", length = 30)
    private String codigoIbge;

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        this.codigoIbge = codigoIbge;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
