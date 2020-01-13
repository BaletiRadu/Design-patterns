import java.util.LinkedList;

public class Subcapitol {
	private String _nume;
	private LinkedList<Element> _elemente;


	public Subcapitol(String nume) {
		_nume = nume;
		_elemente = new LinkedList<Element>();

	}

	public int addParagraf(Paragraf p) {
		_elemente.add(p);
		return _elemente.indexOf(p);
	}

	public Paragraf getParagrafByIndex(int i) {
		return (Paragraf) _elemente.get(i);
	}

	public int addImagine(Imagine i) {
		_elemente.add(i);
		return _elemente.indexOf(i);
	}

	public Imagine getImagineByIndex(int i) {
		return (Imagine) _elemente.get(i);
	}

	public int addTabel(Tabel t) {
		_elemente.add(t);
		return _elemente.indexOf(t);
	}

	public Tabel getTabelByIndex(int i) {
		return (Tabel) _elemente.get(i);
	}

	public String get_nume() {
		return _nume;
	}

	public int createNewImage(String nume) {
		Imagine c = new Imagine(nume);
		_elemente.add(c);
		return _elemente.indexOf(c);
	}

	public int createNewParagraph(String string) {
		Paragraf p = new Paragraf(string);
		_elemente.add(p);
		return _elemente.indexOf(p);
	}

	public int createNewTable(String string) {
		Tabel t = new Tabel(string);
		_elemente.add(t);
		return _elemente.indexOf(t);
	}

	public void print() {
		System.out.println(_nume + "\n");
		for (Element e : _elemente) {
			e.print();
		}
	}
}
