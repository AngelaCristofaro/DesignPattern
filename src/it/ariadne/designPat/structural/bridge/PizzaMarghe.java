package it.ariadne.designPat.structural.bridge;
/**
 *  PizzaMargherita implementa come viene fatta la pizza Margherita
 * @author CRISTOFARO
 *
 */
public class PizzaMarghe implements Pasto {
	
		@Override
		public Pasto getPiatto() {
	        return this;
	    }
	}
