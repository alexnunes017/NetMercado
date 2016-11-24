package br.com.nunes.mercado.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.nunes.mercado.dao.LojaDAO;
import br.com.nunes.mercado.dao.VendedorDAO;
import br.com.nunes.mercado.domain.Loja;
import br.com.nunes.mercado.domain.Vendedor;
import br.com.nunes.mercado.domain.enums.Sexo;

@ManagedBean
@ViewScoped
public class VendedorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Vendedor vendedor;
	private Loja loja;
	private VendedorDAO vendedorDAO;
	private LojaDAO lojaDAO;
	private Long codigoVendedor;
	private Vendedor vendedorSelecionado;

	private List<Vendedor> vendedores;
	private List<Loja> lojas;

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public VendedorDAO getVendedorDAO() {
		return vendedorDAO;
	}

	public void setVendedorDAO(VendedorDAO vendedorDAO) {
		this.vendedorDAO = vendedorDAO;
	}

	public Long getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(Long codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public LojaDAO getLojaDAO() {
		return lojaDAO;
	}

	public void setLojaDAO(LojaDAO lojaDAO) {
		this.lojaDAO = lojaDAO;
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Vendedor getVendedorSelecionado() {
		return vendedorSelecionado;
	}

	public void setVendedorSelecionado(Vendedor vendedorSelecionado) {
		this.vendedorSelecionado = vendedorSelecionado;
	}

	@PostConstruct
	public void iniciar() {
		vendedorDAO = new VendedorDAO();
		lojaDAO = new LojaDAO();
		lojas = lojaDAO.listar();
	}

	public void novo() {
		vendedor = new Vendedor();

	}

	public void salvar() {
		try {
			vendedorDAO.salvar(vendedor);
			Messages.addGlobalInfo("Vendedor Salvo!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Vendedor");
			e.printStackTrace();
		}
	}

	public void merge() {
		try {
			vendedorDAO.merge(vendedor);
			Messages.addGlobalInfo("Produto Editado!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Vendedor");
			e.printStackTrace();
		}
	}

	public void listar() {
		try {
			vendedores = vendedorDAO.listar();

		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao listar os Vendedores");
			e.printStackTrace();
		}
	}

	public void editar() {
		try {
			vendedor = vendedorDAO.buscar(codigoVendedor);
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao editar o Vendedor");
			e.printStackTrace();
		}
	}

	public void excluir() {
		try {
			vendedorDAO.excluir(vendedorSelecionado);
			listar();
			Messages.addGlobalInfo("Cliente Excluido!");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao excluir o Cliente");
			e.printStackTrace();
		}
	}

}
