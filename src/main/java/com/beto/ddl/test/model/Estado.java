package com.beto.ddl.test.model;

import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "estados")
public class Estado implements Serializable {
    @Id
    private Long id;

	@NotBlank
	@Column(name = "nome", nullable = false, length = 150)
	private String nome;

	@NotBlank
	@Column(name = "uf", nullable = false, length = 2)
	private String uf;

	@Column(name = "cod_ibge", length = 2)
	private String codigoIbge;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
