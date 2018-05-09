package it.ariadne.designPat.comportamentali.state;
/**
 * palette presenta dei metodi che consentono di effettuare il set ed il get del colore
 * @author CRISTOFARO
 *
 */
public class Palette {
	
	private Color color;
	 
    public void setColor(Color color) {
        this.color=color;
    }
 
    public void currentColor() {
        color.showColor();
    }
}
