package it.ariadne.designPat.structural.proxy;

import java.util.logging.Logger;
/**
 * Classe sostitutiva dell'oggetto reale
 * @author cristofaro
 *
 */
public class ServiceProxy implements Service{
	
	private MyService service;
	Logger log = Logger.getLogger("ServiceProxy");

    public ServiceProxy(MyService svc){
        this.service = svc;
    }

    @Override
    public void HandleRequest(){
        log.info("Preprocessing by proxy...");
        service.HandleRequest();
        log.info("Postprocessing by proxy...");
    }

}
