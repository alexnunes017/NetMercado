package br.com.nunes.mercado.dao;

import org.junit.Test;

import br.com.nunes.mercado.domain.Loja;


public class LojaDAOTest {
	
	
	Loja loja = new Loja();
	LojaDAO dao = new LojaDAO();
	
	@Test
	public void salvar(){
		loja.setNomeLoja("NetMercado");
		dao.salvar(loja);
		
	}
	
	

}
