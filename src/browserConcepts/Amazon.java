package browserConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Amazon extends Reuseable {
	
	public static void selectAll() {
		WebElement alldropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(alldropdown);
		s.selectByVisibleText("Amazon Fresh");
	}
	
	
	
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.in/");
		selectAll();
	}

}
