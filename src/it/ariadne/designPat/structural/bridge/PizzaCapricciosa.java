package it.ariadne.designPat.structural.bridge;
/**
 * PizzaCapricciosa implementa come viene fatta la pizza Capricciosa
 * @author CRISTOFARO
 *
 */
public class PizzaCapricciosa implements Pasto {
	
	@Override
    public Pasto getPiatto() {
        return this;
    }
}
