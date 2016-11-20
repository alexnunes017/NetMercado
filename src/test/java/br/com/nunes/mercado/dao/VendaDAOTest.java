package br.com.nunes.mercado.dao;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import br.com.nunes.mercado.domain.Cliente;
import br.com.nunes.mercado.domain.Venda;
import br.com.nunes.mercado.domain.Vendedor;

public class VendaDAOTest {

	Venda venda = new Venda();
	VendaDAO vendaDAO = new VendaDAO();
	Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO();
	Vendedor vendedor = new Vendedor();
	VendedorDAO vendedorDAO = new VendedorDAO();
	Date data = Calendar.getInstance().getTime();
	Date hora = Calendar.getInstance().getTime();

	@Test
	public void salvar() {

		cliente = clienteDAO.buscar(1L);
		vendedor = vendedorDAO.buscar(1L);

		venda = new Venda(data, hora, cliente, vendedor);
		vendaDAO.salvar(venda);

	}
}
