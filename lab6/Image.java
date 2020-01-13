
public class Image implements Element{
	private String _nume;

	public Image(String nume) {
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
