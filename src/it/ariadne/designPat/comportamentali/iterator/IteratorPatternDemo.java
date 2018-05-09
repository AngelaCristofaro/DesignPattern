package it.ariadne.designPat.comportamentali.iterator;
/**
 * classe main che stampa i nomi dell'array singolarmente
 * @author CRISTOFARO
 *
 */
public class IteratorPatternDemo {
	public static void main(String[] args) {
	  Repository namesRepository = new Repository();

	  for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
		  String name = (String)iter.next();
	      System.out.println("Name : " + name);
	  } 	
	}
}
