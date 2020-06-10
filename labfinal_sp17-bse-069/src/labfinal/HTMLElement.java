package labfinal;


public class HTMLElement extends HTMLTag {

	private String tagName;
	private String startTag;
	private String endTag;
	private String tagBody;
	
	// constructor 
	HTMLElement(String tagname) {
		tagName = tagname;
	}
	
	// this function prints html on the screen
	
	
	// this function set value in the endtag variable
	@Override
	public void setEndTag(String str) {
		endTag = str;
	}
	
	// this function set value in the settag variable
	@Override
	public void setTagBody(String str) {
		tagBody = str;
	}

	// this function set value in the setnametag variable
	@Override
	public String getTagName() {
		return tagName;
	}
	
	
	
	
	@Override
	public void generateHtml() {
		System.out.println(startTag + " " + tagBody + "   " + endTag);
	}

	// this function set start tag nae value
	@Override
	public void setStartTag(String str) {
		startTag = str;
		
	}
}
