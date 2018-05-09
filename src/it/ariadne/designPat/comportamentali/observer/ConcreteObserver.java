package it.ariadne.designPat.comportamentali.observer;
/**
 * Questa classe implementa il metodo update()
 * per definire l’azione da intraprendere quando interviene un cambio di stato del Subject.
 * @author CRISTOFARO
 *
 */
public class ConcreteObserver implements Observer {
	 
    @Override
    public void update() {
        System.out.println("Sono " + this + ": il Subject e' stato modificato!");
    }
 
}