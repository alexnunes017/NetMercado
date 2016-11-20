package br.com.nunes.mercado.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "itemVenda")
public class ItemVenda extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne()
	private Produto produto;

	@Column(nullable = false, length = 5)
	private Long quantidadeVenda;

	@ManyToOne(cascade = CascadeType.ALL)
	private Venda venda;

	public ItemVenda() {
		super();
	}

	public ItemVenda(Produto produto, Long quantidadeVenda, Venda venda) {
		super();
		this.produto = produto;
		this.quantidadeVenda = quantidadeVenda;
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Long getQuantidadeVenda() {
		return quantidadeVenda;
	}

	public void setQuantidadeVenda(Long quantidadeVenda) {
		this.quantidadeVenda = quantidadeVenda;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

}
