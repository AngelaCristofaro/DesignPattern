package it.ariadne.designPat.structural.proxy;
/**
 * Classe che crea un Servizio (Service) di Service Proxy passando come valore l'oggetto reale
 * @author cristofaro
 *
 */
public class ServiceFactory {
	
	public static Service CreateService(){
        return new ServiceProxy(new MyService());
    }
}
