package it.ariadne.designPat.comportamentali.observer;
/**
 * La classe definisce lo stato del Subject concreto e l’invocazione degli osservatori in caso di cambio di stato.
 * @author CRISTOFARO
 *
 */
public class ConcreteSubject extends Subject {
	 
    private boolean state;
 
    public void setState(boolean state) {
        this.state = state;
        notifyObservers();
    }
 
    public boolean getState() {
        return this.state;
    }
 
}