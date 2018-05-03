package it.ariadne.designPat.comportamentali.builder;

public class Engine {
	
	private double power;

    public Engine(double power) { 
    	this.power = power;
    }

    @Override
    public String toString()
    {
        return "Engine " + power;
    }
}
