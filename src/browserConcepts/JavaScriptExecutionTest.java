package browserConcepts;

import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecutionTest extends Reuseable {

	public static void scrollUsingJS(int x,int y) {
		
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,300)");
	
	js.executeScript("window.scrollby("+x+","+y+")");
	}
	
	public static void main(String[] args) {
		
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.in/");
		scrollUsingJS(0,300);
	}
}
