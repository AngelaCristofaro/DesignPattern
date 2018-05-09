package it.ariadne.designPat.comportamentali.state;

public class Client { 
	public static void main(String[] args) {
		Palette context = new Palette();
		context.setColor(new RedColor());
	    context.currentColor();
	    context.setColor(new WhiteColor());
	    context.currentColor();
	    }
}
	
