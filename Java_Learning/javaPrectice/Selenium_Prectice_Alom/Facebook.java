package Selenium_Prectice_Alom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// Setup Driver for Window
		System.setProperty("webdriver.firefox.driver","C:\\\\Users\\\\zohir\\\\geckodriver-Firefox\\\\geckodriver.exe");
		// Top Casting
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualtitle);
		
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentURL);
		
		//Assertion: Verification expected vs actual
		
		if(actualtitle.equals(actualtitle)) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Title is Incorrect");
		}
		
		if(currentURL.contains(currentURL)) {
			System.out.println("Current URL is Right");
		}
		else {
			System.out.println("Current URL is Wrong");
		}
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
