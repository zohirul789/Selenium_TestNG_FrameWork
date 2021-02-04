package testNG_Allure_Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickMe {
	
	@Test
	public void contextMenu() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac = new Actions(driver);
		
		ac.contextClick(rightClick).perform();
		
		Thread.sleep(2000);
		
		List<WebElement> selectOPT =driver.findElements(By.cssSelector("ul.context-menu-list.context-menu-root li.context-menu-icon"));
		System.out.println(selectOPT.size());
		
		for(int i =0;i<selectOPT.size();i++) {
			String text=selectOPT.get(i).getText();
			System.out.println(text);
			if(text.equals("Copy")) {
				selectOPT.get(i).click();
				break;
				
			}
			
		}
		
		Thread.sleep(3000);
		driver.quit();
	}

}
