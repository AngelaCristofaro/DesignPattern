package it.ariadne.designPat.creational.abstractFactory.my;

import it.ariadne.designPat.creational.abstractFactory.Circle;
/**
 * Classe che estende Cerchio e sovrascrive il metodo contenuto in Shape
 * @author cristofaro
 *
 */
public class MyCircle extends Circle{
		
		@Override
		public void Print() {
			System.out.println("Mio Cerchio");
		}
}
