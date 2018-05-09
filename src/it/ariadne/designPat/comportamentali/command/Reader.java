package it.ariadne.designPat.comportamentali.command;

import it.ariadne.designPat.comportamentali.command.command.Close;
import it.ariadne.designPat.comportamentali.command.command.Open;
import it.ariadne.designPat.comportamentali.command.command.Read;

/**
 * classe che rappresenta la gestione della Lettura, richiama la classe Read tramite l'interfaccia e esegue il metodo in essa contenuto
 * @author CRISTOFARO
 *
 */
public class Reader {
	
	private ICommand[] command;
	
	/** in questo metodo possiamo vedere che è stata richiamata l'interfaccia Icommand come array che per il metodo di lettura
	 * passa la sequenza di operazioni da compiere e che vengono eseguite in un metodo che richiama a sua volta l'Excecute presente nel comando lettura
	 **/
	public Reader() {
		
		this.command = new ICommand[] {
			 new Open(), new Read(), new Close() 
			};
		}
			
	public void Read(){
		for (ICommand cmd : command) {
			cmd.Execute();
		} 
    }
}

