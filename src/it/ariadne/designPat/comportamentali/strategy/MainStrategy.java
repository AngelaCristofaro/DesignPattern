package it.ariadne.designPat.comportamentali.strategy;

public class MainStrategy {
	public static void main(String[] args) throws Exception {
		int[] array = { 21, 10, 71, 18, 8, 5, 20, 1, 67 };
		
		Context ctx = new Context(new BubbleSort());
        array = ctx.SortArray(array);
        
        Context ctx1 = new Context(new MergeSort());
        array = ctx1.SortArray(array);
        
        for (int i : array) {
		System.out.println(i);	
		} 
	}
}
