package it.ariadne.designPat.creational.prototype;
/**
 * classe che estende forma, rappresenta un quadrato che viene disegnato con il metodo Draw()
 * @author CRISTOFARO
 *
 */
public class Square extends Shape {

	public Square(){
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
