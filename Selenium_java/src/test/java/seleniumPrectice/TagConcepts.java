package seleniumPrectice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			
			String linksName=links.get(i).getText();
			
			if(!linksName.isEmpty()) {
			System.out.println(linksName);
			
			}
		}
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
