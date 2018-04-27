package it.ariadne.designPat.structural.decorator;
/**
 * Classe per definire che caratteristica ha una macchina lussuosa
 * @author cristofaro
 *
 */
public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
