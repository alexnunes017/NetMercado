package br.com.nunes.mercado.dao;

import org.junit.Test;

import br.com.nunes.mercado.domain.Produto;
import br.com.nunes.mercado.domain.enums.TipoProduto;

public class ProdutoDAOTest {

	Produto produto = new Produto();
	ProdutoDAO produtoDAO = new ProdutoDAO();

	@Test
	public void salvar() {
		produto = new Produto("Suco de Laranja Integral", 600, 2, 1, 5, TipoProduto.ORIGINAL);
		produtoDAO.salvar(produto);
	}

}
