package it.ariadne.designPat.creational.factory;
/**
 * Classe main che crea le forme Cerchio e Rettangolo
 * @author cristofaro
 *
 */
public class MainEx {
	
	public static void main(String[] args) throws Exception {
		ShapeCreator.Instance();
		ShapeCreator.Instance();
		Shape[] shapes =
		            new Shape[] { ShapeCreator.CreateShape(ShapeType.Cerchio), 
		                          ShapeCreator.CreateShape(ShapeType.Rettangolo)};
		for (Shape shape : shapes) {
			shape.Draw();
		}
	}
}
