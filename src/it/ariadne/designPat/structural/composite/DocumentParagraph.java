package it.ariadne.designPat.structural.composite;
/**
 * Classe che definisce i paragrafi del documento
 * @author cristofaro
 *
 */
public class DocumentParagraph extends DocumentElement {
	
	private String text = null;
	
    public DocumentParagraph(String text){
    	this.text=text;
    }


	@Override
	public void Add(DocumentElement child) throws Exception {
	
	}

	@Override
	public void Remove(DocumentElement child) throws Exception {
		
	}

	@Override
	public void Write() throws Exception {
		System.out.println("Paragraph " + text);
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}
 
}
