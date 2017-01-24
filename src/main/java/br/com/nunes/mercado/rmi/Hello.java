package br.com.nunes.mercado.rmi;

import java.rmi.*;

public interface Hello extends Remote {
	String sayHello() throws RemoteException;

	public long add(long a, long b) throws RemoteException;

	public long sub(long a, long b) throws RemoteException;

	public long mul(long a, long b) throws RemoteException;

	public long div(long a, long b) throws RemoteException;

}