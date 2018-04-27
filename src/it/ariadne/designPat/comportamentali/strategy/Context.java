package it.ariadne.designPat.comportamentali.strategy;
/**
 * Classe che richiama l'algoritmo nel contruttore
 * @author cristofaro
 *
 */
public class Context {
	
	private SortAlgorithm algorithm;

    public Context(SortAlgorithm algorithm){
        this.algorithm = algorithm;
    }

    public int[] SortArray(int[] array) throws Exception{
        return algorithm.Sort(array);
    }

}
