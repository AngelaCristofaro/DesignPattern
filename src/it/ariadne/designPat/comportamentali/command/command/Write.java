package it.ariadne.designPat.comportamentali.command.command;

import java.util.logging.Logger;

import it.ariadne.designPat.comportamentali.command.ICommand;
/**
 * classe che implementa l'interfaccia ICommand e ha la funzione di scrittura
 * @author CRISTOFARO
 *
 */
public class Write implements ICommand {
	Logger log = Logger.getLogger("info");
	
	@Override
	public void Execute(){
        log.info("Write");
    }
}
