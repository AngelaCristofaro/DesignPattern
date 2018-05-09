package it.ariadne.designPat.creational.prototype;
/**
 * la classe astratta shape implementa Cloneable
 * @author CRISTOFARO
 *
 */
public abstract class Shape implements Cloneable {
	   
	//caratteristiche della forma
	private String id;
	protected String type;
	   
	//metodo astratto disegnaForma
	abstract void draw();
	   
	//set & get delle caratteristiche sopra dichiarate
	public String getType(){
		return type;
	}
	   
	public String getId() {
		return id;
	   }
	   
	public void setId(String id) {
		this.id = id;
	}
	   
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
		}

}
