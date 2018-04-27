package it.ariadne.designPat.structural.decorator;
/**
 * Classe che definisce una macchina base
 * @author cristofaro
 *
 */
public class BasicCar implements Car {

	@Override
	public void assemble() {
		System.out.print("Basic Car.");
	}
}
