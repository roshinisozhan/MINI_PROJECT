package browserConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reuseable {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browsername) {
		switch (browsername) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver= new EdgeDriver();
			break;
		case "Firefox":
			driver= new FirefoxDriver();
			break;
		}
		driver.manage().window().maximize();
		
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	
	public static void closeBrowser() {
		driver.quit();
	}
	public static void main(String[] args) throws Exception{
		launchBrowser("Chrome");
	}

}
