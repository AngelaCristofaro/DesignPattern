package it.ariadne.designPat.creational.abstractFactory.my;

import it.ariadne.designPat.creational.abstractFactory.Circle;
import it.ariadne.designPat.creational.abstractFactory.Rectangle;
import it.ariadne.designPat.creational.abstractFactory.ShapeFactory;
/**
 * 
 * @author cristofaro
 *
 */
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
