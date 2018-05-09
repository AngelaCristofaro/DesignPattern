package it.ariadne.designPat.comportamentali.state;
/**
 * WhiteColor implementa l’interfaccia definendo le caratteristiche del colore, sia come stringa che come valore esadecimale
 * @author CRISTOFARO
 *
 */
public class WhiteColor implements Color{
 
    private static final String COLOR_NAME = "WHITE";
    private static final String HEX_COLOR = "#FFFFFF";
 
    @Override
    public void showColor() {
        System.out.println( COLOR_NAME );
    }
}
