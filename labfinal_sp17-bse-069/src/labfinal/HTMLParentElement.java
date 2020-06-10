package labfinal;


import java.util.ArrayList;

public class HTMLParentElement extends HTMLTag{
	private String tagName;
	private String startTag;
	private String endTag;
	
	
	
	//this function removes children from the array list 
	public void removeChildTag(HTMLTag tag) {
		children.remove(tag);
	}
	
	// this function set value in the tag name variable.
	public String getTagName() {
		return tagName;
	}


	
  //
	//this function set value in the end tag variable
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	
	// this funcion set value starttag of parent variable 
	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}
	// this function add children int tha children list declared in the parent class
	public void addChildTag(HTMLTag tag){
		children.add(tag);
	}
	
	
	// this function set value in parent tag name
	public HTMLParentElement(String tag){
		tagName = tag;
	}
	
	// this function returns the list of all the childre of parent tag
	public ArrayList<HTMLTag> getChildren(){
		return children;
	}
 
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for (HTMLTag htmlTag : children) {
			htmlTag.generateHtml();
		}
		System.out.println(endTag);
	}
	
}