package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	@Test
	public void frameConcepts() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		driver.switchTo().frame(2);
		WebElement header=driver.findElement(By.tagName("h2"));
		String text=header.getText();
		System.out.println(text);
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

	
}
