package it.ariadne.designPat.comportamentali.observer;
/**
 * creare il soggetto da osservare e due osservatori che si registrano per essere notificati in caso di cambio di stato del soggetto osservato.
 * Successivamente viene rimosso un osservatore e cambiato lo stato del soggetto osservato per notare che non riceverà più notifiche. 
 * @author CRISTOFARO
 *
 */
public class Main {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver();
		Observer observer2 = new ConcreteObserver();
		 
		//aggiungo 2 observer che saranno notificati
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		 
		//modifico lo stato
		subject.setState( true );
		 
		//rimuovo il primo observer che non sarà + notificato
		subject.removeObserver(observer1);
		 
		//modifico lo stato
		subject.setState( false ); 
		 }
}
