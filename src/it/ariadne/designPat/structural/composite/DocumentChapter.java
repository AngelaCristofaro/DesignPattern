package it.ariadne.designPat.structural.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * Classe che definisce i capitoli del documento
 * @author cristofaro
 *
 */
public class DocumentChapter extends DocumentElement{
	
	/*inizializzazione di un int che indica il numero del capitolo e di una lista di capitoli figli del documento*/
	private int chapterNumber;
    private List<DocumentElement> children =new ArrayList<DocumentElement>();

    public DocumentChapter(int number){
        this.chapterNumber = number;
    }

    /*Override dei tre metodi dichiarati nella classe astratta */
    @Override
    public void Add(DocumentElement child) throws Exception{
        children.add(child);
    }

    @Override
    public void Remove(DocumentElement child) throws Exception{
        children.remove(child);
    }
    
    @Override
    public void Write() throws Exception{
        System.out.println("Chapter " + chapterNumber);
        for (DocumentElement documentElement : children) {
        	documentElement.Write();
		} 
    }
}