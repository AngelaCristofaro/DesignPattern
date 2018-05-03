package it.ariadne.designPat.comportamentali.abstractFactory;
/**
 * Classe rettangolo che implementa il metodo Print di Shape
 * @author cristofaro
 *
 */
public class Rectangle implements Shape{

	@Override
	public void Print() {
		System.out.println("RETTANGOLO");	
	}
}
