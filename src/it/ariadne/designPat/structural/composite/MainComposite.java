package it.ariadne.designPat.structural.composite;

public class MainComposite {

	public static void main(String[] args) throws Exception {
		DocumentParagraph pg1 = new DocumentParagraph("1.1");
        DocumentParagraph pg2 = new DocumentParagraph("1.2");
        DocumentParagraph pg3 = new DocumentParagraph("2.1");
        DocumentParagraph pg4 = new DocumentParagraph("2.2");

        DocumentChapter chp1 = new DocumentChapter(1);

        chp1.Add(pg1);
        chp1.Add(pg2);
        chp1.Write();

        DocumentChapter chp2 = new DocumentChapter(2);
        
        chp2.Add(pg3);
        chp2.Add(pg4);
        chp2.Write();

	}

}
