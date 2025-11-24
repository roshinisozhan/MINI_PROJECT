package browserConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshort extends Reuseable {
public static void facebookTest() throws InterruptedException {
		launchBrowser("Chrome");
		launchUrl("https://www.facebook.com/");
		Thread.sleep(5000);
	}

public static void navigationMethods() {
	driver.navigate().to("https://meet.google.com/");
	
}

public static void captureScreenShot(String filename) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\prince-2838\\eclipse-workspace\\SeleniumPractice\\myscreenshot"+ filename + ".png");
	try {
		FileHandler.copy(src, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


public static void main(String[] args) throws InterruptedException {
	facebookTest();
	captureScreenShot("facebook");
	navigationMethods();
	captureScreenShot("meet");
	
}

	
}
