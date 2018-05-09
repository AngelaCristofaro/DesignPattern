package it.ariadne.designPat.comportamentali.templateMethod;
/**
 * Algoritmo base, che � una classe astratta, � composto da tre fasi dichiarate in MyAlgorithm
 * @author CRISTOFARO
 *
 */
public abstract class AlgorithmBase {
	
	 public void ExecuteAlgorithm()
     {
         ExecuteStepOne();
         ExecuteStepTwo();
         ExecuteStepThree();
     }

     protected abstract void ExecuteStepOne();
     protected abstract void ExecuteStepTwo();
     protected abstract void ExecuteStepThree();
}
