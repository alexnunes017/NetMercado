package br.com.nunes.mercado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "loja")
public class Loja extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length = 50, nullable = false)
	private String nomeLoja;

	public Loja() {
		super();
	}

	public Loja(String nomeLoja) {
		super();
		this.nomeLoja = nomeLoja;
	}

	public String getNomeLoja() {
		return nomeLoja;
	}

	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}

}
