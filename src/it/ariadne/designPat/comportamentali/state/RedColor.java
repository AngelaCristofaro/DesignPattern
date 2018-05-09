package it.ariadne.designPat.comportamentali.state;
/**
 * RedColor implementa l’interfaccia definendo le caratteristiche del colore, sia come stringa che come valore esadecimale
 * @author CRISTOFARO
 *
 */
public class RedColor implements Color{
 
    private static final String COLOR_NAME = "RED";
    private static final String HEX_COLOR = "#FF0000";
 
    @Override
    public void showColor() {
        System.out.println( COLOR_NAME );
    }
}
