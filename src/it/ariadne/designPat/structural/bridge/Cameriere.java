package it.ariadne.designPat.structural.bridge;
/**
 * L'interfaccia Cameriere definisce il metodo ordinazione che prende come parametro il pasto
 * @author CRISTOFARO
 *
 */
public interface Cameriere {
    Pasto ordinazione(Pasto pasto);
}
