package br.com.nunes.mercado.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.nunes.mercado.dao.ClienteDAO;
import br.com.nunes.mercado.domain.Cliente;
import br.com.nunes.mercado.domain.enums.TipoProduto;

@ManagedBean
@ViewScoped
public class ClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private ClienteDAO clienteDAO;
	private Long codigoCliente;

	private List<Cliente> clientes;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDAO getClienteDAO() {
		return clienteDAO;
	}

	public void setClienteDAO(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoProduto) {
		this.codigoCliente = codigoProduto;
	}

	public TipoProduto[] getTiposProdutos() {
		return TipoProduto.values();
	}

	@PostConstruct
	public void iniciar() {
		clienteDAO = new ClienteDAO();
	}

	public void novo() {
		cliente = new Cliente();
	}

	public void salvar() {
		try {
			clienteDAO.salvar(cliente);
			Messages.addGlobalInfo("Cliente Salvo!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Cliente");
			e.printStackTrace();
		}
	}

	public void merge() {
		try {
			clienteDAO.merge(cliente);
			Messages.addGlobalInfo("Cliente Editado!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Cliente");
			e.printStackTrace();
		}
	}

	public void listar() {
		try {
			clientes = clienteDAO.listar();

		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao listar os Clientes");
			e.printStackTrace();
		}
	}

	public void editar() {
		try {
			cliente = clienteDAO.buscar(codigoCliente);
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao editar o Cliente");
			e.printStackTrace();
		}
	}

}
