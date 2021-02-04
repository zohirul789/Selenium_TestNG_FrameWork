package testNG_Allure_Reports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcepts {
	
	@Test
	public void waitConcept() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Contact");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("This")).click();
		FluentWait<WebDriver> waits = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(50, TimeUnit.MILLISECONDS);
		
		waits.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ContactUs")));
		
		
		
		
		String result=driver.findElement(By.className("ContactUs")).getText();
		
		if(result.contains("Python")) {
			System.out.println("Test Pass");
		}
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
	}

}
