package it.ariadne.designPat.comportamentali.visitor;
/**
 * classe main che restituisce l'area passando i valori dei parametri necessari allo scopo
 * @author CRISTOFARO
 *
 */
public class Main {
	public static void main(String[] args) {
		ElementRettangolo elementRettangolo = new ElementRettangolo();
        elementRettangolo.setAltezza(10);
        elementRettangolo.setLarghezza(20);
        elementRettangolo.accept( new VisitorRettangoloAria() );	
	}
}
