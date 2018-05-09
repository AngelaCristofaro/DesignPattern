package it.ariadne.designPat.comportamentali.templateMethod;

import java.util.logging.Logger;
/**
 * MyAlgorithm estende la classe astratta AlgoritmoBase e divide l'algoritmo in tre step
 * @author CRISTOFARO
 *
 */
public class MyAlgorithm extends AlgorithmBase{

	Logger log = Logger.getLogger("info");
	
	@Override
	protected void ExecuteStepOne() {
		log.info("Step one");	
	}

	@Override
	protected void ExecuteStepTwo() {
		log.info("Step two");	
	}

	@Override
	protected void ExecuteStepThree() {
		log.info("Step three");	
	}

}
