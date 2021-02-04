package seleniumPrectice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		/* 1. tips
		driver.findElement(By.name("userName")).sendKeys("zohirul789");
		driver.findElement(By.name("password")).sendKeys("05071988");
		driver.findElement(By.name("submit")).click();
		*/
		
		//2. tips
		/* 
		 * 	WebElement userName=driver.findElement(By.name("userName"));
			WebElement password=driver.findElement(By.name("password"));
			WebElement submit=driver.findElement(By.name("submit"));
		
			userName.sendKeys("zohirul789");
			password.sendKeys("05071988");
			submit.click();
		*/
		
		By userName = By.name("userName");
		By password = By.name("password");
		By submit = By.name("submit");
		By signoff = By.xpath("//a[contains(text(),'SIGN-OFF')]");
		
		
//		Thread.sleep(3000);
/*		driver.findElement(userName).sendKeys("zohirul789");
		driver.findElement(password).sendKeys("123456");
		driver.findElement(submit).click();*/
		
//		getElement(userName).sendKeys("zohirul789");
//		getElement(password).sendKeys("05071988");
//		getElement(submit).click();
//		
		
		doSendKeys(userName,"zulfa013");
		doSendKeys(password,"05071988");
		doClick(submit);
		Thread.sleep(3000);
		doSignoff(signoff);
		closeBrowser();
		
		
		
		

	}
	public static WebElement getElement(By locator) {
		WebElement element =driver.findElement(locator);
		return element;
		
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void doSignoff(By locator) {
		getElement(locator).click();

	}
	public static void closeBrowser() {
		driver.close();
	}
	
}
