package it.ariadne.designPat.creational.builder;

import java.util.logging.Logger;
/**
 * Classe che assembla l'oggetto
 * @author cristofaro
 *
 */
public class CarBuild {
	
	public static Car CreateCar(double wheelSize, double enginePower){
		Logger log = Logger.getLogger("CarBuild.class");
		Car c = new Car();
		c.setWheels(new Wheel((double) wheelSize));
		c.setEngine(new Engine(enginePower));
		c.setChassis(new Chassis());
		log.info(c.toString());
		return c;
    }
}
