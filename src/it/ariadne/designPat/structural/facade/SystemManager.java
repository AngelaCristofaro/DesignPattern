package it.ariadne.designPat.structural.facade;
/**
 * Classe di gestione dei sottosistemi
 * @author cristofaro
 *
 */
public class SystemManager {
	
	public static void DoSomething(){
	new SystemOne().DoSomething();
    new SystemTwo().DoSomething();
    new SystemThree().DoSomething();
	}
}
