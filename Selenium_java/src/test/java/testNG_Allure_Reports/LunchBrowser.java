package testNG_Allure_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class LunchBrowser {
	
	@Test
	public void lunchFirefoxUsingSystemSP() {
		FirefoxOptions fo= new FirefoxOptions();
		fo.addArguments("--headless");
		// Setup Driver for Windows
		System.setProperty("webdriver.firefox.driver", "C:\\\\Users\\\\zohir\\\\geckodriver-Firefox\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("http://www.google.com");
		//Verify Actual Title
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualtitle);
		
		// Verify Current URL
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentURL);
		
		// Assertion: Verify expected vs actual
		if(actualtitle.equals(actualtitle)) {
			
			System.out.println("Title is Correct");
			
		}
		else {
			System.out.println("Title is Incorrecrt");
		}
		if(currentURL.contains(currentURL)) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("Current URL is Wrong");
		}
		// browser will wait 3 second before close
		//Thread.sleep(3000);
		// Closing the Browser
		//driver.close();
		

	}
	

}
