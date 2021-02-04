package testNG_Allure_Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserConcepts {
	
	static String expectedTitle="CRMPRO - CRM software for customer relationship management, sales, and support.";
	static String expectedURL="https://crmpro.com/";
	
	@Test
	public void headlessrowserTest() {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title is: "+actualTitle);
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Actual Title matched with Expected Title");
		}
		else {
			System.out.println("Actual Ttitle Dosent Match with Expected Title");
		}
		String actualURL=driver.getCurrentUrl();
		System.out.println("Actual URL is: "+actualURL);
		
		if(actualURL.contains(expectedURL)) {
			System.out.println("The Actual URL Matched with Expected URL");
		}
		else {
			System.out.println("The Actual URL dosen't matched with Expected URL");
		}
		
		driver.close();
	}

}
