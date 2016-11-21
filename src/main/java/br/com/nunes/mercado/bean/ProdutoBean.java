package br.com.nunes.mercado.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.nunes.mercado.dao.ProdutoDAO;
import br.com.nunes.mercado.domain.Produto;

@ManagedBean
@ViewScoped
public class ProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;
	private ProdutoDAO produtoDAO;

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

	@PostConstruct
	public void iniciar() {
		produtoDAO = new ProdutoDAO();
	}

	public void listar() {
		try {
			ProdutoDAO produtoDAO = new ProdutoDAO();
			produtos = produtoDAO.listar();

		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao listar os Produtos");
			e.printStackTrace();
		}

	}

}
