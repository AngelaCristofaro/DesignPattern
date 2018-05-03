package it.ariadne.designPat.comportamentali.abstractFactory.my;

import it.ariadne.designPat.comportamentali.abstractFactory.Rectangle;
/**
 * Classe che estende Rettangolo e sovrascrive il metodo contenuto in Shape
 * @author cristofaro
 *
 */
public class MyRectangle extends Rectangle{
	
	@Override
	public void Print() {
		System.out.println("Mio Rettangolo");
	}
}
