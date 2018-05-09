package it.ariadne.designPat.creational.prototype;
/**
 * classe che estende forma, rappresenta un rettangolo che viene disegnato con il metodo Draw()
 * @author CRISTOFARO
 *
 */
public class Rectangle extends Shape {
	
	public Rectangle(){
	     type = "Rectangle";
	   }

	   @Override
	   public void draw() {
	      System.out.println("Inside Rectangle::draw() method.");
	   }
}
