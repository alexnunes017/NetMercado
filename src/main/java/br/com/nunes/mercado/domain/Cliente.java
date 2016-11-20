package br.com.nunes.mercado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "cliente")
public class Cliente extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length = 50, nullable = false)
	private String nomeCliente;

	public Cliente() {
		super();
	}

	public Cliente(String nomeCliente) {
		super();
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
