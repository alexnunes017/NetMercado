package br.com.nunes.mercado.util.rmi;

import java.rmi.Remote;
import java.sql.Connection;

import org.hibernate.SessionFactory;

public interface Hibernate extends Remote {

	public SessionFactory fabricaDeSessoes();

	public SessionFactory getFabricaDeSessoes();

	public Connection getConexao();

	public SessionFactory criarFabricaDeSessoes();

}
