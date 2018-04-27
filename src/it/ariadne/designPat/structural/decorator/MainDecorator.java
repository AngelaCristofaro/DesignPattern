package it.ariadne.designPat.structural.decorator;
/**
 * Classe Main che richiama una macchina 
 * @author cristofaro
 *
 */
public class MainDecorator {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		System.out.println("\n*****");
		
		Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxurySportsCar.assemble();
	}
}

