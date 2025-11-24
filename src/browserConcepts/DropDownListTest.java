package browserConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest extends Reuseable {
	
	public static void enterFirstandLastName(String fname,String lname) {
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(fname);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys(lname);
		}
	
	public static void selectDateofBirth() {
		WebElement day_dropdown = driver.findElement(By.id("day"));
		Select s = new Select(day_dropdown);
		s.selectByIndex(25);
		
	}
	
	public static void selectMonthofBirth() {
		WebElement month_dropdown = driver.findElement(By.name("birthday_month"));
		Select s = new Select(month_dropdown);
		s.selectByValue("3");
	}
	
	public static void selectYearofBirth() {
		WebElement year_dropdown = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select s = new Select(year_dropdown);
		s.selectByVisibleText("1997");
	}
	
	public static void selectFemale() {
		WebElement femalebutton = driver.findElement(By.xpath("//input[@value='1']"));
		femalebutton.click();
	}
	
	public static void enterMailId() {
		WebElement mailid = driver.findElement(By.name("reg_email__"));
		mailid.sendKeys("Roshinisozhan@gmail.com");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("8976544874");
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	}
	
	
	
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/r.php?entry_point=login");
		enterFirstandLastName("Roshini","R");
		selectDateofBirth();
		selectMonthofBirth();
		selectYearofBirth();
		selectFemale();
		enterMailId();
		}

}

	