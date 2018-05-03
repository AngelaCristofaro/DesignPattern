package it.ariadne.designPat.comportamentali.abstractFactory.my;

import it.ariadne.designPat.comportamentali.abstractFactory.Circle;
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
