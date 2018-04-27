package it.ariadne.designPat.comportamentali.strategy;

import java.util.Arrays;

/**
 * Algoritmo di ordinamento
 * @author cristofaro
 *
 */
public class MergeSort extends SortAlgorithm {

	@Override
	public int[] Sort(int[] array){
		Arrays.sort(array);
		return array;
	}

}
