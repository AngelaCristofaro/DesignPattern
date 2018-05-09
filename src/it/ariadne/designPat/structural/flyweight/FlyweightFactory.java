package it.ariadne.designPat.structural.flyweight;

import java.util.Hashtable;

/**
 * questa classe gestisce la creazione, la cache degli oggetti Flyweight e l’interazione con il Client
 * @author CRISTOFARO
 *
 */
public class FlyweightFactory {
	
	//lista dei codici hash legati ai caratteri
	private static Hashtable<Character, FlyweightCharacter> cache = new Hashtable<Character, FlyweightCharacter>();
	//metodo che prevede la restituzione di un carattere flyweight inserendo in ingresso un carattere
    public static FlyweightCharacter getFlyweight(Character character) {
        FlyweightCharacter flyweight = null;
        //se esiste la chiave del carattere nella cache (memoria) restituisce il carattere flyweight, altrimenti lo inserisce in memoria
        if (cache.containsKey(character)) {
            flyweight = cache.get(character);
        } else {
            flyweight = new ConcreteFlyweightCharacter(character);
            cache.put(character, flyweight);
        }
        return flyweight;
    }

}
