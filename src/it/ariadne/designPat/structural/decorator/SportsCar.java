package it.ariadne.designPat.structural.decorator;
/**
 * Classe per definire che caratteristica ha una macchina sportiva
 * @author cristofaro
 *
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Adding features of Sports Car.");
	}
}
