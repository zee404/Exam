package labfinal;


import java.util.ArrayList;

 abstract class HTMLTag {
	 // this list will be accessible across its all children
	 protected ArrayList<HTMLTag> children = new ArrayList<HTMLTag>();
		
	HTMLTag(){
		
	}
	// the body of these functions will be in chlid classes 
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	
	
	
	public void setTagBody(String body) {
		
	}
	
	public void addChildTag(HTMLTag tag) {
		
	}
	
	public void removeChildTag(HTMLTag tag) {
		
	}
	
	public ArrayList<HTMLTag> getChildren(){
		
		return children;
		
	}
	
	public abstract void generateHtml();
}
