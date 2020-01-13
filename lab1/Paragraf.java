
public class Paragraf extends Element{
	private String _txt;

	public Paragraf(String txt) {
		_txt = txt;
	}

	public String getText() {
		return _txt;
	}

	@Override
	public void print() {
		System.out.println(_txt);
	}
}
