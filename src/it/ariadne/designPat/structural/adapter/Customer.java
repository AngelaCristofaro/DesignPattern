package it.ariadne.designPat.structural.adapter;
/**
 * Classe cliente che contiene il nome completo del cliente richiamando e sovrascrivendo il metodo della classe astratta che estende
 * @author cristofaro
 *
 */
public class Customer extends Contact {
	
	 private String fullName;

     public Customer(String fullName){
         
    	 this.fullName = fullName;
     }

	@Override
	public String FullName() {

		return fullName;
	}

}
