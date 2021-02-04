package testNG_Allure_Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagConcepts {
	
	@Test
	public void getLinksNameByTag() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+links.size());
		
		for(int i =0;i<links.size();i++) {
			String linksName=links.get(i).getText();
			
			
			if(!linksName.isEmpty()) {
				System.out.println(linksName);
			}
		}
		driver.close();
	}

}
