package it.ariadne.designPat.comportamentali.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
/**
 * Il Subject include una lista degli osservatori che si registrano presso il soggetto osservato tramite i metodi addObserver()
 * e si cancellano tramite il metodo removeObserver(). 
 * Il metodo notifyObservers() viene invocato da ConcreteSubject quando interviene un cambio di stato.
 * @author CRISTOFARO
 *
 */

public abstract class Subject {
	
	Logger log = Logger.getLogger("info"); 
		 
	    private List<Observer> list = new ArrayList<Observer>();
	 
	    public void addObserver(Observer observer) {
	        list.add( observer );
	    }
	 
	    public void removeObserver(Observer observer) {
	        list.remove( observer );
	    }
	 
	    public void notifyObservers() {
	        for(Observer observer: list) {
	            observer.update();
	        }
	    }
	 
	}

