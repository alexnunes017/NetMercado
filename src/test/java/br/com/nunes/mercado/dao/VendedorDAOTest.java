package br.com.nunes.mercado.dao;

import org.junit.Test;

import br.com.nunes.mercado.domain.Loja;
import br.com.nunes.mercado.domain.Vendedor;
import br.com.nunes.mercado.domain.enums.Sexo;

public class VendedorDAOTest {

	Loja loja = new Loja();
	LojaDAO lojaDAO = new LojaDAO();
	Vendedor vendedor = new Vendedor();
	VendedorDAO vendedorDAO = new VendedorDAO();

	@Test
	public void salvar() {
		loja = lojaDAO.buscar(1L);
		vendedor.setLoja(loja);
		vendedor.setCpfVendedor("000.000.000-00");
		vendedor.setNomeVendedor("Alex");
		vendedor.setSexo(Sexo.MASCULINO);
		vendedor.setSenha("123");
		vendedor.setSenhaSemCriptografia("123");
		vendedorDAO.salvar(vendedor);
	}
}
