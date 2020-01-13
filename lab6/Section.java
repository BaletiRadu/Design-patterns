import java.util.LinkedList;

public class Section implements Element{
	private LinkedList<Element> _content = new LinkedList<Element>();
	private String _section_title;
	public Section(String section_title) {_section_title = section_title;}
	
	public int add(Element e) {
		_content.add(e);
		return _content.indexOf(e);
	}
	
	public void remove(Element e) {
		_content.remove(e);
	}
	
	public Element getElement(int index) {
		return _content.get(index);
	}
	
	public String get_section_title() {
		return _section_title;
	}

	@Override
	public void print() {
		System.out.println(_section_title);
		for (Element e : _content) {
			e.print();
		}
	}
}
