package browserConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RedbusRegisteration extends Reuseable{
	
	
	public static void verifyRedbusBrowser() throws InterruptedException {
		
		WebElement from = driver.findElement(By.xpath("(//div[@class='label___9f9f41 '])[1]"));
		from.click();
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='Search Boarding Point']"));
		source.sendKeys("Banglore");
		WebElement to = driver.findElement(By.xpath("(//div[@class='srcDest___3c0d7e'])[2]"));
		to.click();
		
		to.sendKeys("Madurai");
		WebElement search = driver.findElement(By.xpath("//img[@data-autoid='oipCard_30426']"));
		search.click();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchUrl("https://www.redbus.in/");
		verifyRedbusBrowser();
	}

}
