package browserConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Meesho extends Reuseable {
	
	
	public static void shoppingOnline() {
		
		WebElement search = driver.findElement(By.xpath("//span[text()='Women Ethnic']"));
		search.click();
		
		
		
		
	}
	
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchUrl("https://www.meesho.com/");
		shoppingOnline();
	}

}
