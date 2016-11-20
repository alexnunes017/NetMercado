package br.com.nunes.mercado.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "venda")
public class Venda extends GenericDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date dataVenda;

	@Temporal(TemporalType.TIME)
	private Date horaVenda;

	@ManyToOne(cascade = CascadeType.ALL)
	private Cliente cliente;

	@ManyToOne(cascade = CascadeType.ALL)
	private Vendedor vendedor;

	
	
	public Venda() {
		super();
	}

	public Venda(Date dataVenda, Date horaVenda, Cliente cliente, Vendedor vendedor) {
		super();
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Date getHoraVenda() {
		return horaVenda;
	}

	public void setHoraVenda(Date horaVenda) {
		this.horaVenda = horaVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

}
