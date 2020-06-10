package labfinal;

public class Demo {
	public static void main(String[] Args) {
		
		// main function
		
		// creating object of paternelement
		HTMLTag parentTag = new HTMLParentElement("<html>");
		
		
		parentTag.setStartTag("<html>");
	
		parentTag.setEndTag("</html>");
		//creating another object of parentelement
		HTMLTag p1 = new HTMLParentElement("<body>");
		p1.setStartTag("<body>");
		p1.setEndTag("</body>");
		parentTag.addChildTag(p1);
		//creating object of element class
		HTMLTag child1 = new HTMLElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Testing my HTML tag library");
		p1.addChildTag(child1);
		//creating object of element class
		child1 = new HTMLElement("<P>");
		child1.setStartTag("<P>");
		child1.setEndTag("</P>");
		child1.setTagBody("Paragraph 2");
		p1.addChildTag(child1);
		// generating html on the console
		parentTag.generateHtml();

	}
}
