package br.com.nunes.mercado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import br.com.nunes.mercado.domain.enums.TipoProduto;

@Entity(name = "produto")
public class Produto extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(length = 100, nullable = false)
	private String nomeProduto;

	@Column(length = 10, precision = 4, scale = 4, nullable = false)
	private Double precoProduto;

	@Column(length = 5, nullable = false)
	private Integer estoqueMinimo;

	@Column(length = 5, nullable = false)
	private Integer estoqueAtual;

	@Column(length = 5, nullable = false)
	private Integer estoqueMaximo;

	@Enumerated(EnumType.STRING)
	private TipoProduto tipoProduto;

	public Produto() {
		super();
	}

	public Produto(String nomeProduto, Double precoProduto, Integer estoqueMinimo, Integer estoqueAtual,
			Integer estoqueMaximo, TipoProduto tipoProduto) {
		super();
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueAtual = estoqueAtual;
		this.estoqueMaximo = estoqueMaximo;
		this.tipoProduto = tipoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Double precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Integer getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Integer estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Integer getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(Integer estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public Integer getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(Integer estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
