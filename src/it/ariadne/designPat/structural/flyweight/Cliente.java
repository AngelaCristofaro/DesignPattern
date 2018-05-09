package it.ariadne.designPat.structural.flyweight;
/**
 * classe main che mi restituisce il valore del carattere che ho indicato in uppercase, il suo hash code,  e il colore settato.
 * @author CRISTOFARO
 *
 */
public class Cliente {
	  public static void main(String[] args) {
		  
	        FlyweightCharacter a1 = FlyweightFactory.getFlyweight('a');
	        System.out.println( "HashCode: " + a1.hashCode() );
	        System.out.println( "Value: " + a1.operation() );
	        a1.setColor("red");
	 
	        FlyweightCharacter a2 = FlyweightFactory.getFlyweight('A');
	        System.out.println( "HashCode: " + a2.hashCode() );
	        System.out.println( "Value: " + a2.operation() );
	        a2.setColor("blue");
	 
	    }

}

//nota : A e a hanno due hash code diversi e quindi rappresentano lo stesso oggetto (lettera A dell'alfabeto) ma con una rappresentazione differente
