package it.ariadne.designPat.comportamentali.command.command;

import java.util.logging.Logger;

import it.ariadne.designPat.comportamentali.command.ICommand;

/**
 * classe che implementa l'interfaccia e rappresenta il comando di Apertura ("Open")
 * @author CRISTOFARO
 *
 */
public class Open implements ICommand{
	Logger log = Logger.getLogger("info");
	
	@Override
	public void Execute(){
        log.info("Open");
    }
}
