package testNG_Allure_Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class GoogleSearch {
	
	public void searchTextInGoogle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> sugetionList=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		System.out.println(sugetionList.size());
		
		for(int i= 0; i<sugetionList.size();i++) {
			System.out.println(sugetionList.get(i).getText());
			if(sugetionList.get(i).getText().equals("selenium vitamin"));{
				sugetionList.get(i).click();
				break;
			}
			
			
			
		}
		Thread.sleep(2000);
		driver.close();
	}

}
