package it.ariadne.designPat.comportamentali.observer;

/**
 * L’interfaccia dell’Observer definisce il metodo che dovrà essere implementato dagli osservatori.
 * Pertanto quando interverranno delle modifiche al soggetto osservato, verrà invocato il metodo update() di tutti gli osservatori.
 * @author CRISTOFARO
 *
 */
public interface Observer {
	 
    public void update();
 
}
