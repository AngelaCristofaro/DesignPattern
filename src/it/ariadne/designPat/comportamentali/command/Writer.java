package it.ariadne.designPat.comportamentali.command;

import it.ariadne.designPat.comportamentali.command.command.Close;
import it.ariadne.designPat.comportamentali.command.command.Open;
import it.ariadne.designPat.comportamentali.command.command.Write;
/**
 * classe che rappresenta la gestione della Scrittura, richiama la classe Read tramite l'interfaccia e esegue il metodo in essa contenuto
 * @author CRISTOFARO
 *
 */
public class Writer {
	
	private ICommand[] command;
	
	/** in questo metodo possiamo vedere che è stata richiamata l'interfaccia Icommand come array che per il metodo di scrittura
	 * passa la sequenza di operazioni da compiere e che vengono eseguite in un metodo che richiama a sua volta l'Excecute presente nel comando lettura
	 **/
	public Writer() {
		
		this.command = new ICommand[] {
			 new Open(), new Write(), new Close() 
			};
		}
			
	public void Write(){
		for (ICommand cmd : command) {
			cmd.Execute();
		} 
    }

}
