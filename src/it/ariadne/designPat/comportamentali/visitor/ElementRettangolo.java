package it.ariadne.designPat.comportamentali.visitor;
/**
 * classe che definisce le caratteristiche dell'oggetto rettangolo utili al calcolo dell'area
 * @author CRISTOFARO
 *
 */
public class ElementRettangolo {
	private int altezza;
    private int larghezza;
 
    public int getAltezza() {
        return this.altezza;
    }
 
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
 
    public int getLarghezza() {
        return this.larghezza;
    }
 
    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }
 
    public void accept(VisitorRettangoloAria visitor) {
        visitor.visitRettangoloAria(this);
    }
}
