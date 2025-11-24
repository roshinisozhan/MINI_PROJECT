package browserConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AlertTest extends Reuseable{
	
	public static void handleSimpleAlert() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebElement alert_btn = driver.findElement(By.id("alertButton"));
		alert_btn.click();
		
		Alert simple_alert = driver.switchTo().alert();
		Thread.sleep(5000);
		simple_alert.accept();
	}
	
	public static void handlePromptAlert() throws InterruptedException {
		String expected ="Please enter your name";
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		
		WebElement alert_btn = driver.findElement(By.id("promtButton"));
		alert_btn.click();
		
		Alert prompt_btn = driver.switchTo().alert();
		Thread.sleep(5000);
		
		if(expected.equals(prompt_btn.getText())) {
			prompt_btn.sendKeys("rose");
			prompt_btn.accept();
		}
		else {
			System.out.println("Unexpected alert");
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchUrl("https://demoqa.com/alerts");
		handleSimpleAlert();
		handlePromptAlert();
		
	}

}
