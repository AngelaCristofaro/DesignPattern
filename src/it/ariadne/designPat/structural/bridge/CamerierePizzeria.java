package it.ariadne.designPat.structural.bridge;
/**
 * La classe implementa cameriere restituendoci il piatto ordinato
 * @author CRISTOFARO
 *
 */
public class CamerierePizzeria implements Cameriere {
	    public Pasto ordinazione(Pasto pasto) {
	        return pasto;
	    }
}
