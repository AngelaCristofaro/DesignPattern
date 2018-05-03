package it.ariadne.designPat.structural.proxy;

/**
 * 
 * @author cristofaro
 *
 */
public class MainProxy {
	public static void main(String[] args) {
		Service svc = ServiceFactory.CreateService();
        svc.HandleRequest();
	}
}
