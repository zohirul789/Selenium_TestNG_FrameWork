package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTours {
	static WebDriver driver;
	
	@Test
	public void login() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		By UserName = By.xpath("//input[@name='userName']");
		By Password = By.xpath("//input[@name='password']");
		By Submit = By.xpath("//input[@name='submit']");
		
//		Actions ac = new Actions(driver);
		
/*		ac.sendKeys(getElement(UserName),"zulfa013").perform();
		ac.sendKeys(getElement(Password),"05071988").perform();
		ac.click(getElement(Submit)).perform();*/
		
		actionsSendkeys(UserName,"zulfa013");
		actionsSendkeys(Password,"05071988");
		actionsClick(Submit);
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	public static WebElement getElement(By locator) {
		WebElement element =driver.findElement(locator);
		return element;
	}
	public static void actionsSendkeys(By locator,String value) {
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator),value).perform();
		
	}
	public static void actionsClick(By locator) {
		Actions ac = new Actions(driver);
		ac.click(getElement(locator)).perform();
	}

}
