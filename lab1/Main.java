
public class Main {
	public static void main(String[] args) {
		/*
		Paragraf paragraf1 = new Paragraf("text paragraf1");
		
		Imagine img1 = new Imagine("img1");
		
		Tabel tabel1 = new Tabel();
		
		Subcapitol subcapitol1 = new Subcapitol("subcap1");
		subcapitol1.addParagraf(paragraf1);
		subcapitol1.addImagine(img1);
		subcapitol1.addTabel(tabel1);
		
		Capitol capitol1 = new Capitol("capitol 1");
		capitol1.addSubcapitol(subcapitol1);
		
		Autor autor1 = new Autor("John","Wick");
	
		Cuprins cuprins = new Cuprins();
		cuprins.set_txt("blalabla");
		
		Carte carte1 = new Carte("How to cook shaorma in 5 minutes");
		carte1.setCuprins(cuprins);
		carte1.addAutor(autor1);
		*/
		
		/*
		Carte carte1 = new Carte("carte1");
		Autor autor1 = new Autor("John", "Wick");
		carte1.addAutor(autor1);
		int indexOfChapter = carte1.createChapter("Chapter1");
		Capitol capitol1 = carte1.getChapter(indexOfChapter);
		
		int indexOfSubchapter = capitol1.createSubChapter("subchapter1");
		Subcapitol subcap1 = capitol1.getSubChapter(indexOfSubchapter);
		
		int indexOfImagine = subcap1.createImage("img1");
		int indexOfParagrapf = subcap1.createParagraph("paragraph1");
		int indexOfTable = subcap1.createTable("table1");
		
		subcap1.print();
		*/
		
		Carte discoTitanic = new Carte("Disco Titanic");
		Autor rpGheo = new Autor("Radu Pavel Gheo");
		
		discoTitanic.addAutor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Capitol chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		Subcapitol scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createNewParagraph("Paragraph 1");
		scOneOne.createNewParagraph("Paragraph 2");
		scOneOne.createNewParagraph("Paragraph 3");
		scOneOne.createNewImage("Image 1");
		scOneOne.createNewParagraph("Paragraph 4");
		scOneOne.createNewTable("Table 1");
		scOneOne.createNewParagraph("Paragraph 5");
		
		scOneOne.print();
	}
}
