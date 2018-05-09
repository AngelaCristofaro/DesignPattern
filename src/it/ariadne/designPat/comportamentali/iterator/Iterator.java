package it.ariadne.designPat.comportamentali.iterator;
/**
 * interfaccia che dichiara due metodi di navigazione legati all'iterazione --> next() e hasNext()
 * @author CRISTOFARO
 *
 */
public interface Iterator {
	public boolean hasNext();
	public Object next();
}
