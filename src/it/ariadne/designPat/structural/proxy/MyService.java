package it.ariadne.designPat.structural.proxy;

import java.util.logging.Logger;
/**
 * L'oggetto reale
 * @author cristofaro
 *
 */
public class MyService implements Service{
	
	Logger log = Logger.getLogger("MyService");
	
	@Override
	public void HandleRequest() {
		log.info("Handling the request...");
	}
}
