package browserConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class MiniProject extends Reuseable {
	
	public static void login() {
		WebElement Click_Login = driver.findElement(By.id("login2"));
		Click_Login.click();
	}
	
	public static void Enter_Login_Details()  {
		WebElement User_Name = driver.findElement(By.id("loginusername"));
		User_Name.sendKeys("roshiniprince");
		WebElement Password = driver.findElement(By.id("loginpassword"));
		Password.sendKeys("krishtharun");
	}
	public static void demoblaze_Login() 
	{
		
		WebElement Login_button = driver.findElement(By.xpath("//button[@onclick='logIn()']"));
		Login_button.click();
	}
	public static void screenshot(String filename) {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\prince-2838\\eclipse-workspace\\SeleniumPractice\\myscreenshot1"+ filename + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void searchLaptop() throws InterruptedException {
		WebElement Click_Categories = driver.findElement(By.xpath("//a[text()='CATEGORIES']"));
		Click_Categories.click();
		
		WebElement Click_Laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
		Click_Laptop.click();
		Thread.sleep(2000);
		WebElement Click_SonyLaptop = driver.findElement(By.xpath("//a[text()='Sony vaio i5']"));
		Click_SonyLaptop.click();
		
	}
	
	public static void Add_Cart() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement Cart_Laptop = driver.findElement(By.xpath("//a[text()='Add to cart']"));
		Cart_Laptop.click();
		
	}
	
	public static void check_Simple_Alert() throws InterruptedException {
		
	Thread.sleep(3000);
	Alert alert=driver.switchTo().alert();
	String alert_text = alert.getText();
	System.err.println(alert_text);
	alert.accept();
		
		
	}
	
	public static void check_Cart_Details() throws InterruptedException {
		WebElement Cart_Details = driver.findElement(By.xpath("//a[text()='Cart']"));
		Cart_Details.click();
		Thread.sleep(3000);
		
		WebElement Place_Order = driver.findElement(By.xpath("//button[text()='Place Order']"));
		Place_Order.click();
		
		}
	
	public static void enter_Order_Details() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement Name = driver.findElement(By.id("name"));
		Name.sendKeys("Roshini");
		
		WebElement Country = driver.findElement(By.id("country"));
		Country.sendKeys("India");
		
		WebElement City = driver.findElement(By.id("city"));
		City.sendKeys("Thiruninravur");
		
		WebElement Credit_Card = driver.findElement(By.id("card"));
		Credit_Card.sendKeys("45790765435789");
		
		WebElement Month = driver.findElement(By.id("month"));
		Month.sendKeys("10");
		
		WebElement Year = driver.findElement(By.id("year"));
		Year.sendKeys("2026");
		
		WebElement Purchase_Button = driver.findElement(By.xpath("//button[text()='Purchase']"));
		Purchase_Button.click();
		
	}
	
	public static void clickOkButton() {
		WebElement Click_Ok = driver.findElement(By.xpath("//button[text()='OK']"));
		Click_Ok.click();
		
		}
	
	public static void logOut() {
		WebElement Click_LogOut_Button = driver.findElement(By.xpath("//a[text()='Log out']"));
		Click_LogOut_Button.click();
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("Chrome");
		launchUrl("https://www.demoblaze.com/");
		login();
		Thread.sleep(3000);
		Enter_Login_Details();
		demoblaze_Login();
		Thread.sleep(3000);
		screenshot("loginCreation1");
		searchLaptop();
		Add_Cart();
		check_Simple_Alert();
		check_Cart_Details();
		enter_Order_Details();
		Thread.sleep(3000);
		screenshot("LaptopOrderedDetails");
		clickOkButton();
		Thread.sleep(3000);
		logOut();
		
	}
	

}
