package it.ariadne.designPat.creational.singleton;
	/**
	 * Classe Singleton di esempio per esercitarsi sui design patterns.
	 * 
	 * @author cristofaro
	 *
	 */
public class SingletonProva {
	
	//inizializzare instanza 
	private static SingletonProva instance = null;
	
	//costruttore Singleton privato assicura un unico esemplare della classe
	private SingletonProva() {}
	
	//metodo che assegna un valore Singleton all'instanza	
	public static SingletonProva getInstance() {
		if(instance == null)
			instance = new SingletonProva();	
		return instance;	
		
	}
	
}
