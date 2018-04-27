package it.ariadne.designPat.structural.facade;
/**
 * Classe Main che richiama la classe di gestione che a sua volta contiene un metodo che richiama i tre sottosistemi
 * @author cristofaro
 *
 */
public class MainFacade {
	
	public static void main(String[] args) {
		SystemManager.DoSomething();	
	}
}
