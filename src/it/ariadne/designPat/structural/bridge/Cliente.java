package it.ariadne.designPat.structural.bridge;
/**
 * Main che restituisce gli orgini dei clienti
 * @author CRISTOFARO
 *
 */
public class Cliente {
	 public static void main(String[] args) {
	        Cameriere cameriere = new CamerierePizzeria();
	        Pasto ordinazione = cameriere.ordinazione(new PizzaMarghe());
	        System.out.println(ordinazione);
	        Pasto ordinazione1 = cameriere.ordinazione(new PizzaCapricciosa());
	        System.out.println(ordinazione1);
	    }
}
