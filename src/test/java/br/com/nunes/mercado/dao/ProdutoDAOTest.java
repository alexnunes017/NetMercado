package br.com.nunes.mercado.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.nunes.mercado.domain.Produto;
import br.com.nunes.mercado.domain.enums.TipoProduto;

public class ProdutoDAOTest {

	Produto produto = new Produto();
	ProdutoDAO produtoDAO = new ProdutoDAO();

	@Test
	public void salvar() {
		Short s = new Short((short) 1);
		BigDecimal decimal = new BigDecimal(12);
		produto = new Produto("Suco de Uva Integral", decimal, s, s, s, TipoProduto.SIMILAR);
		produtoDAO.salvar(produto);
	}

}
