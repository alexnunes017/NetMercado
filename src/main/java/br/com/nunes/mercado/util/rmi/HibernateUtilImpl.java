package br.com.nunes.mercado.util.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;

import org.hibernate.SessionFactory;

@SuppressWarnings("serial")
public class HibernateUtilImpl extends UnicastRemoteObject implements Hibernate {

	protected HibernateUtilImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public SessionFactory fabricaDeSessoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionFactory getFabricaDeSessoes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connection getConexao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SessionFactory criarFabricaDeSessoes() {
		// TODO Auto-generated method stub
		return null;
	}

}