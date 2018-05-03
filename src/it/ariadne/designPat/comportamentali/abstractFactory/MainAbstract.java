package it.ariadne.designPat.comportamentali.abstractFactory;

import it.ariadne.designPat.comportamentali.abstractFactory.my.MyShapeFactory;
/**
 * Classe Main che richiama i metodi che creano le forme,che a loro volta contengono un richiamo alle classi Cerchio/Rettangolo. 
 * @author cristofaro
 *
 */
public class MainAbstract {
	public static void main(String[] args) {
		
		ShapeFactory fac = new MyShapeFactory();
        Circle c = fac.CreateCircle();
        Rectangle r = fac.CreateRectangle();
        c.Print();
        r.Print();
	}
}
