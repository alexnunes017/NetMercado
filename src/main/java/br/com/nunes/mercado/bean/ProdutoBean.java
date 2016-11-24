package br.com.nunes.mercado.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.nunes.mercado.dao.ProdutoDAO;
import br.com.nunes.mercado.domain.Produto;
import br.com.nunes.mercado.domain.enums.TipoProduto;

@ManagedBean
@ViewScoped
public class ProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	private ProdutoDAO produtoDAO;
	private Long codigoProduto;
	private Produto produtoSelecionado;

	private List<Produto> produtos;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public ProdutoDAO getProdutoDAO() {
		return produtoDAO;
	}

	public void setProdutoDAO(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}

	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public TipoProduto[] getTiposProdutos() {
		return TipoProduto.values();
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	@PostConstruct
	public void iniciar() {
		produtoDAO = new ProdutoDAO();
	}

	public void novo() {
		produto = new Produto();
	}

	public void salvar() {
		try {
			produtoDAO.salvar(produto);
			Messages.addGlobalInfo("Produto Salvo!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Produto");
			e.printStackTrace();
		}
	}

	public void merge() {
		try {
			produtoDAO.merge(produto);
			Messages.addGlobalInfo("Produto Editado!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Produto");
			e.printStackTrace();
		}
	}

	public void listar() {
		try {
			produtos = produtoDAO.listar();

		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao listar os Produtos");
			e.printStackTrace();
		}
	}

	public void editar() {
		try {
			produto = produtoDAO.buscar(codigoProduto);
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao editar o Produto");
			e.printStackTrace();
		}
	}

	public void excluir() {
		try {
			produtoDAO.excluir(produtoSelecionado);
			listar();
			Messages.addGlobalInfo("Cliente Excluido!");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao excluir o Cliente");
			e.printStackTrace();
		}
	}

}
