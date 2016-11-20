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
	private Long estoqueMinimo;

	@Column(length = 5, nullable = false)
	private Long estoqueAtual;

	@Column(length = 5, nullable = false)
	private Long estoqueMaximo;

	@Enumerated(EnumType.STRING)
	private TipoProduto tipoProduto;

	public Produto() {
		super();
	}

	public Produto(String nomeProduto, Double precoProduto, Long estoqueMinimo, Long estoqueAtual, Long estoqueMaximo,
			TipoProduto tipoProduto) {
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

	public Long getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(Long estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public Long getEstoqueAtual() {
		return estoqueAtual;
	}

	public void setEstoqueAtual(Long estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}

	public Long getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(Long estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

}
