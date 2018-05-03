package it.ariadne.designPat.comportamentali.builder;
/**
 * 
 * @author cristofaro
 *
 */
public class Wheel {
	
	private double size;

    public Wheel(double size) {
    	this.size = size;
    }

    @Override
    public String toString()
    {
        return "Wheel " + size;
    }
}
