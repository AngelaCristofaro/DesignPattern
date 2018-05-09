package it.ariadne.designPat.comportamentali.memento;
/**
 * L’Originator detiene le informazioni di stato interne nelle sue proprietà e consente di accederne in lettura/scrittura tramite i metodi set e get.
 * Il Memento è visibile solo all’Originator e non ad altre classi.
 * @author CRISTOFARO
 *
 */
public class Originator {
	private Object originatorState;
	 
    public void setOriginatorState(Object state) {
        originatorState = state;
    }
 
    public Object getOriginatorState() {
        return originatorState;
    }
 
    public Memento createMemento() {
        Memento memento = new Memento();
        memento.setMementoState( originatorState );
        return memento;
    }
 
    public void restoreMemento(Memento memento) {
        originatorState = memento.getMementoState();
    }
 
    public class Memento {
 
        private Object mementoState;
 
        private Object getMementoState() {
            return this.mementoState;
        }
 
        private void setMementoState(Object originatorState) {
            this.mementoState = originatorState;
        }
    }
}
