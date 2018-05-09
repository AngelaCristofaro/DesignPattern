package it.ariadne.designPat.structural.flyweight;
/**
 * interfaccia dei caratteri dell'alfabeto
 * al suo interno ci sono due metodi, uno che richiama il singolo carattere dell'alfabeto e l'altro le sue caratteristiche
 * @author CRISTOFARO
 *
 */
public interface FlyweightCharacter {
	
    public Character operation();
    public void setColor(String color);
}
