package testNG_Allure_Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhpTravals {
	
	@Test
	public void verifyAlllinks() {
		
		FirefoxOptions fo= new FirefoxOptions();
		fo.addArguments("--headless");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links: "+links.size());
		
		for(int i =0; i<links.size();i++) {
			String linksName=links.get(i).getText();
			
			if(!linksName.isEmpty()) {
				System.out.println("Link Name is: "+linksName);
			}
		}
		
		driver.close();
		
		
		
		
	}

}
