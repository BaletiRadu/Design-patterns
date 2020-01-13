
public class Paragraph implements Element{
	private String _txt;
	private AlignStrategy _alignStrategy;
	public Paragraph(String txt) {
		_txt = txt;
	}

	public String getText() {
		return _txt;
	}

	@Override
	public void print() {
		if(_alignStrategy!=null)
			_alignStrategy.print(_txt);
		else
			System.out.println(_txt);
	}

	public AlignStrategy getAlignStrategy() {
		return _alignStrategy;
	}

	public void setAlignStrategy(AlignStrategy _alignStrategy) {
		this._alignStrategy = _alignStrategy;
	}
}
