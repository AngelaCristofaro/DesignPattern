package it.ariadne.designPat.comportamentali.iterator;
/**
 * classe concreta che implementa Container
 * @author CRISTOFARO
 *
 */
public class Repository implements Container {
	
	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }
}
