package Selenium_Prectice_Alom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasic {

	public static void main(String[] args) throws InterruptedException {
		//Setup Driver for Windows
		System.setProperty("webdriver.firefox.driver", "C:\\\\Users\\\\zohir\\\\geckodriver-Firefox\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();//Top Casting
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Actual Title is: "+actualtitle);

		//Assertion: verification expected vs actual
		if(actualtitle.equals(actualtitle)) {
			System.out.println("Title is Correct");
			
		}
		else {
			System.out.println("Title is Incorrect");
		}
		//Get Current URL
		String currentURL=driver.getCurrentUrl();
		System.out.println("Curren URL is: "+currentURL);
		
		if(currentURL.contains("google")) {
			System.out.println("Correct URL");
		}
		else {
			System.out.println("Incorrect URL");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
