package br.com.nunes.mercado.domain;

import java.math.BigDecimal;

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

	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal precoProduto;

	@Column(length = 5, nullable = false)
	private Short estoqueMinimo;

	@Column(length = 5, nullable = false)
	private Short estoqueAtual;

	@Column(length = 5, nullable = false)
	private Short estoqueMaximo;

	@Enumerated(EnumType.STRING)
	private TipoProduto tipoProduto;

	public Produto() {
		super();
	}

	public Produto(String nomeProduto, BigDecimal precoProduto, Short estoqueMinimo, Short estoqueAtual,
			Short estoqueMaximo, TipoProduto tipoProduto) {
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

	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Short getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Short estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Short getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(Short estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public Short getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(Short estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

}
