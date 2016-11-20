package br.com.nunes.mercado.dao;

import org.junit.Test;

import br.com.nunes.mercado.domain.ItemVenda;
import br.com.nunes.mercado.domain.Produto;
import br.com.nunes.mercado.domain.Venda;

public class ItemVendaDAOTest {

	ItemVenda itemVenda = new ItemVenda();
	ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
	Venda venda = new Venda();
	VendaDAO vendaDAO = new VendaDAO();
	Produto produto = new Produto();
	ProdutoDAO produtoDAO = new ProdutoDAO();

	@Test
	public void salvar() {

		produto = produtoDAO.buscar(1L);
		venda = vendaDAO.buscar(1L);
		itemVenda = new ItemVenda(produto, 10L, venda);
		itemVendaDAO.salvar(itemVenda);
	}

}
