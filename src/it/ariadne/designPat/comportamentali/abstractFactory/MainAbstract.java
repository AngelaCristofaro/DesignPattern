package it.ariadne.designPat.comportamentali.abstractFactory;

import it.ariadne.designPat.comportamentali.abstractFactory.my.MyShapeFactory;

public class MainAbstract {
	public static void main(String[] args) {
		
		ShapeFactory fac = new MyShapeFactory();
        Circle c = fac.CreateCircle();
        Rectangle r = fac.CreateRectangle();
        c.Print();
        r.Print();
	}
}
