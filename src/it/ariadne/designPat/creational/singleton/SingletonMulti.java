package it.ariadne.designPat.creational.singleton;

	/**
	 * classe con singleton in multithreading con il metodo di creazione dell'instanza privato 
	 * e un metodo pubblico che richiama quello privato di creazione solo se instanza non esiste già
	 * @author cristofaro
	 *
	 */

public class SingletonMulti {
	
	/** inizializzazione instanza */
	private static SingletonMulti instance = null;
	
	/**contruttore vuoto*/
	public SingletonMulti() {
	}
	
	/**metodo privato e statico sincronizzato per creare l'instanza*/
	private synchronized static SingletonMulti createInstance() {
		if(instance == null) {
			instance = new SingletonMulti();
		}
		return instance;
	}
	
	//metodo pubblico per richiamare il metodo di creazione instanza
	public static SingletonMulti instance() {
		if(instance == null) {
			createInstance();
		}
		return instance;
	}

}
