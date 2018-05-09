package it.ariadne.designPat.comportamentali.visitor;
/**
 * classe usata per calcolare l'area e che verrà invocata da accept()
 * @author CRISTOFARO
 *
 */
public class VisitorRettangoloAria {
	public void visitRettangoloAria(ElementRettangolo elementRettangolo) {
        int aria = elementRettangolo.getAltezza() * elementRettangolo.getLarghezza();
        System.out.println("L'area del rettangolo e': " + aria);
    }
}
