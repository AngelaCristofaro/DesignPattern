package it.ariadne.designPat.comportamentali.builder;

import java.util.logging.Logger;

/**
 * Classe di esecuzione
 * @author cristofaro
 *
 */
public class MainEx {
	public static void main(String[] args) {
		Logger log = Logger.getLogger("LogMain");
		CarBuild.CreateCar(120, 110);
		log.info("creata");
	}
}
