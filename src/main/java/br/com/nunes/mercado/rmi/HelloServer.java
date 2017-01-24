package br.com.nunes.mercado.rmi;



import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class HelloServer {
    public static void main(String args[]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            //Cria HelloImpl
            //Runtime.getRuntime().exec("rmiregistry 1010");
            //Registry registry = LocateRegistry.getRegistry(2001);
            Registry registry = LocateRegistry.createRegistry(1099);
            HelloImpl obj = new HelloImpl();
            registry.bind("HelloServer", obj);
            System.out.println("Hello Server pronto.");
        } catch (Exception e) {
            System.out.println("HelloServer erro " + e.getMessage());
        }
    }
}