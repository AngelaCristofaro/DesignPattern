package it.ariadne.designPat.creational.prototype;

import java.util.Hashtable;
/**
 * caricare gli oggetti rappresentati dalle classi concrete su db rappresentato da un Hashtable
 * @author CRISTOFARO
 *
 */
public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

	public static Shape getShape(String string) throws CloneNotSupportedException {
		Shape cachedShape = shapeMap.get(string);
		Shape cosa = (Shape) cachedShape.clone();
		return cosa;
	}
	   
	public static void loadCache() {

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(),square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	   }
}