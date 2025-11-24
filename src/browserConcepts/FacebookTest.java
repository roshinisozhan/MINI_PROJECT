package browserConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FacebookTest extends Reuseable {
	public static void verifyFacebookLoginAccount() {
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("roshinis@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("krish2215");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
	}
	public static void verifyFacebookCreateNewAccount() {
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/");
		WebElement create_new_account = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create_new_account.click();
		WebElement create_account_text = driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']"));
		String expected = "Create a new account";
		if (expected.equals(create_account_text.getText())){
			System.out.println(expected);
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("roshini");
			WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
			surname.sendKeys("r");
			WebElement mailid = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			mailid.sendKeys("roshinisozhan@gmail.com");
			WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("8754678993");
		
		}
	
	}
	
	
	public static void main(String[] args) {
		//verifyFacebookLoginAccount();
		verifyFacebookCreateNewAccount();
	}

}
