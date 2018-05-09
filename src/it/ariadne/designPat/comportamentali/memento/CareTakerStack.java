package it.ariadne.designPat.comportamentali.memento;
import java.util.Stack;

import it.ariadne.designPat.comportamentali.memento.Originator.Memento;
/**
 * la classe CareTakerStack che si interfaccia direttamente con la classe Originator per definire lo stato ed eventualmente ripristinarlo.
 * @author CRISTOFARO
 *
 */
public class CareTakerStack {
	private static Stack<Memento> mementoStack = new Stack<Memento>();
	 
    public static void main(String[] args) {
        Originator originator = new Originator();
 
        originator.setOriginatorState("x");
        //memorizzo lo stato attuale
        mementoStack.push( originator.createMemento() );
        System.out.println("Stato Originator: " + originator.getOriginatorState() );
 
        originator.setOriginatorState("z");
        //memorizzo il nuovo stato attuale
        mementoStack.push( originator.createMemento() );
        System.out.println("Stato Originator: " + originator.getOriginatorState() );
 
        //rimuovo l'ultimo stato
        mementoStack.pop();
 
        //ripristino lo stato precedente
        originator.restoreMemento(mementoStack.pop());
        System.out.println("Stato Originator: " + originator.getOriginatorState() );
    }

}
