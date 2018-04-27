package it.ariadne.designPat.structural.composite;
/**
 * Classe astratta che contiene le funzioni applicabili agli elementi di un documento
 * @author cristofaro
 *
 */
public abstract class DocumentElement {
	
	public abstract void Add(DocumentElement child) throws Exception;
    public abstract void Remove(DocumentElement child) throws Exception;
    public abstract void Write() throws Exception;
}
