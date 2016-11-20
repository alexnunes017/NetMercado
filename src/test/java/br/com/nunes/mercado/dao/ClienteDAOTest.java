package br.com.nunes.mercado.dao;

import org.junit.Test;

import br.com.nunes.mercado.domain.Cliente;

public class ClienteDAOTest {

	Cliente cliente = new Cliente();
	ClienteDAO clienteDAO = new ClienteDAO();

	@Test
	public void salvar() {
		cliente = new Cliente("Nunes");
		clienteDAO.salvar(cliente);

	}

}
