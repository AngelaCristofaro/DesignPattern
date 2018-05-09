package it.ariadne.designPat.comportamentali.command;
/**
 * classe main test dei metodi creati per lettura e scrittura con il design pattern COMMAND
 * @author CRISTOFARO
 *
 */
public class Main {
	
	public static void main(String[] args) {
		 Reader reader = new Reader();
         reader.Read();
         Writer writer = new Writer();
         writer.Write();
	}
}
