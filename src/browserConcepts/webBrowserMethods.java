package browserConcepts;

public class webBrowserMethods extends Reuseable {
	
	public static void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void getUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	public static void navigationMethods() throws Exception  {
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
		public static void main(String[] args) throws Exception {
		launchBrowser("Chrome");
		launchUrl("https://www.amazon.in/");
		getTitle();
		getUrl();
		navigationMethods();
		getTitle();
		closeBrowser();
		
	}
	

}
