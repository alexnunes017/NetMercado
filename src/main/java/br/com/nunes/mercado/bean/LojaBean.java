package br.com.nunes.mercado.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.nunes.mercado.dao.LojaDAO;
import br.com.nunes.mercado.domain.Loja;

@ManagedBean
@ViewScoped
public class LojaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Loja loja;
	private LojaDAO lojaDAO;
	private Long codigoLoja;
	private Loja lojaSelecionada;

	private List<Loja> lojas;

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

	public Long getCodigoLoja() {
		return codigoLoja;
	}

	public void setCodigoLoja(Long codigoLoja) {
		this.codigoLoja = codigoLoja;
	}

	public List<Loja> getLojas() {
		return lojas;
	}

	public void setLojas(List<Loja> lojas) {
		this.lojas = lojas;
	}

	public Loja getLojaSelecionada() {
		return lojaSelecionada;
	}

	public void setLojaSelecionada(Loja lojaSelecionada) {
		this.lojaSelecionada = lojaSelecionada;
	}

	@PostConstruct
	public void iniciar() {
		lojaDAO = new LojaDAO();
	}

	public void novo() {
		loja = new Loja();
	}

	public void salvar() {
		try {
			lojaDAO.salvar(loja);
			Messages.addGlobalInfo("Loja Salvo!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Loja");
			e.printStackTrace();
		}
	}

	public void merge() {
		try {
			lojaDAO.merge(loja);
			Messages.addGlobalInfo("Loja Editado!");
			novo();

		} catch (Exception e) {
			Messages.addGlobalError("Ocorreu um erro Ao salvar o Loja");
			e.printStackTrace();
		}
	}

	public void listar() {
		try {
			lojas = lojaDAO.listar();

		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao listar os Lojas");
			e.printStackTrace();
		}
	}

	public void editar() {
		try {
			loja = lojaDAO.buscar(codigoLoja);
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao editar o Loja");
			e.printStackTrace();
		}
	}

	public void excluir() {
		try {
			lojaDAO.excluir(lojaSelecionada);
			listar();
			Messages.addGlobalInfo("Cliente Excluido!");
		} catch (RuntimeException e) {
			Messages.addGlobalError("Ocorreu um erro Ao excluir o Cliente");
			e.printStackTrace();
		}
	}

}
