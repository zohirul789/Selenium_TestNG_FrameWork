package testNG_Allure_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VeryfiyFcaebook {
	String ExpectedTitle="Facebook - Log In or Sign Up";
	String ExpectedURL="https://www.facebook.com/";
	
	@Test
	public void verifyFacebookTitle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		
		
		if(actualTitle.equals(ExpectedTitle)) {
			System.out.println("The Title is Absolutely Right");
			
		}
		else {
			System.out.println("The page Title is Totally Wrong");
		}
		Thread.sleep(2000);
		driver.close();
		
		
	}
	@Test
	public void verifyFacebookURL() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String currentURL=driver.getCurrentUrl();
		System.out.println("The Current URL is: "+currentURL);
		
		if(currentURL.contains(ExpectedURL)) {
			System.out.println("The Page URL is Correct");
		}
		else {
			System.out.println("The Page URL is Wrong");
		}
		Thread.sleep(2000);
		driver.close();
		
	}
	

}
