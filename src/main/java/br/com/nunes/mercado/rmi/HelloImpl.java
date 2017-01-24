package br.com.nunes.mercado.rmi;




import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject implements Hello {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HelloImpl() throws RemoteException {
        super();
    }
    public String sayHello() {
        return "HelloWorld!";
    }
    
    public long add(long a, long b) throws RemoteException {
		return a + b;
	}

	public long sub(long a, long b) throws RemoteException {
		return a - b;
	}

	public long mul(long a, long b) throws RemoteException {
		return a * b;
	}

	public long div(long a, long b) throws RemoteException {
		return a / b;
	}
    
}