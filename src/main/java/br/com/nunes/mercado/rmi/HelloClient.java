package br.com.nunes.mercado.rmi;

import java.rmi.*;

public class HelloClient {
	public static void main(String args[]) {
		// Cria e instala o security manager
		// System.setSecurityManager (new RMISecurityManager () );
		try {
			// Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloServer");
			Hello obj = (Hello) Naming.lookup("rmi://localhost:1099/HelloServer");
			System.out.println(obj.sayHello());

			System.out.println("Adição: " + obj.add(20, 5));
			System.out.println("Subtração: " + obj.sub(20, 5));
			System.out.println("Multiplicação: " + obj.mul(20, 5));
			System.out.println("Divisão: " + obj.div(20, 5));

		} catch (Exception e) {
			System.out.println("HelloClient erro" + e.getMessage());
		}
		System.exit(0);
	}
}