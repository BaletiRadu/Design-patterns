import java.util.LinkedList;

public class Carte {
	private String _nume;
	private LinkedList<Autor> _autori;
	private Cuprins _cuprins;
	private LinkedList<Capitol> _capitole;

	public Carte(String nume) {
		_autori = new LinkedList<Autor>();
		_capitole = new LinkedList<Capitol>();
		_nume = nume;
	}

	public void addAutor(Autor autor) {
		_autori.add(autor);
	}

	public void removeAutors() {
		_autori.clear();
	}

	public String getNume() {
		return _nume;
	}

	public void setNume(String _nume) {
		this._nume = _nume;
	}

	public void setCuprins(Cuprins c) {
		_cuprins = c;
	}

	public Cuprins getCuprins() {
		return _cuprins;
	}

	public int createChapter(String nume) {
		Capitol c = new Capitol(nume);
		_capitole.add(c);
		return _capitole.indexOf(c);
	}

	public Capitol getChapter(int indexOfChapter) {
		return _capitole.get(indexOfChapter);
	}

	public String toString() {
		String str;
		str = _nume + "\n";
		for (Autor a : _autori) {
			str += a.toString();
		}
		str += "\n" + _cuprins + "\n";
		for (Capitol c : _capitole) {
			str += c.toString();
		}
		return (str + "\n");
	}
}
