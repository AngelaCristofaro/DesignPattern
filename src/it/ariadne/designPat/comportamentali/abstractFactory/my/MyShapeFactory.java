package it.ariadne.designPat.comportamentali.abstractFactory.my;

import it.ariadne.designPat.comportamentali.abstractFactory.Circle;
import it.ariadne.designPat.comportamentali.abstractFactory.Rectangle;
import it.ariadne.designPat.comportamentali.abstractFactory.ShapeFactory;

public class MyShapeFactory implements ShapeFactory {

	@Override
	public Rectangle CreateRectangle() {
		return new MyRectangle();
	}

	@Override
	public Circle CreateCircle() {
		return new MyCircle();
	}

}
