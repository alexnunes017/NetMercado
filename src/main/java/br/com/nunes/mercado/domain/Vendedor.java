package br.com.nunes.mercado.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import br.com.nunes.mercado.domain.enums.Sexo;

@Entity(name = "vendedor")
public class Vendedor extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length = 14, nullable = false, unique = true)
	private String nomeVendedor;

	@Column(length = 14, nullable = false, unique = true)
	private String cpfVendedor;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Column(length = 32, nullable = false)
	private String senha;

	@Transient
	private String senhaSemCriptografia;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable = false)
	private Loja loja;

	
	
	public Vendedor() {
		super();
	}

	public Vendedor(String nomeVendedor, String cpfVendedor, Sexo sexo, String senha, String senhaSemCriptografia,
			Loja loja) {
		super();
		this.nomeVendedor = nomeVendedor;
		this.cpfVendedor = cpfVendedor;
		this.sexo = sexo;
		this.senha = senha;
		this.senhaSemCriptografia = senhaSemCriptografia;
		this.loja = loja;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public String getCpfVendedor() {
		return cpfVendedor;
	}

	public void setCpfVendedor(String cpfVendedor) {
		this.cpfVendedor = cpfVendedor;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaSemCriptografia() {
		return senhaSemCriptografia;
	}

	public void setSenhaSemCriptografia(String senhaSemCriptografia) {
		this.senhaSemCriptografia = senhaSemCriptografia;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

}
