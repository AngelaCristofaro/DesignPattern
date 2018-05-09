package it.ariadne.designPat.comportamentali.iterator;
/**
 * classe che implementa iterator richiamata in Repository che a sua volta implementa Container
 * @author CRISTOFARO
 *
 */
public class NameIterator implements Iterator { 
	
	public String names[] = {"Robert" , "John" ,"Julie" , "Lora"}; 
	int index;
	
	//override del metodo contenuto nell'interfaccia in cui conto il numero di elementi dell'array
	@Override
	public boolean hasNext() {
		if(index < names.length) {
			return true;
		}
		return false;
	}

	//override metodo che richiama il nome successivo
	@Override
	public Object next() {
		if(this.hasNext()){
            return names[index++];
         }
        return null;
	}

}
