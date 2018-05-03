package it.ariadne.designPat.comportamentali.builder;
/**
 * Classe Car che rappresenta l'oggetto
 * @author cristofaro
 *
 */
public class Car {
	
	private Wheel wheels;
    private Engine engine;
    private Chassis chassis;
    
	public Wheel getWheels() {
		return wheels;
	}
	
	public void setWheels(Wheel wheel) {
		this.wheels=wheel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public Chassis getChassis() {
		return chassis;
	}
	
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	} 
	
	@Override
	public String toString()
    {
        return wheels.toString() + " / " + 
               engine.toString() + " / " + chassis.toString();
    }
}
