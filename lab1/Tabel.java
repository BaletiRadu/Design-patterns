
public class Tabel extends Element{
	private String _nume;

	public Tabel(String nume) {
		_nume = nume;
	}

	public String getNume() {
		return _nume;
	}

	@Override
	public void print() {
		System.out.println(_nume);
	}
}
