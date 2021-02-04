import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
		By userName = By.name("userName");
		By password = By.name("password");
		By submit = By.name("submit");
		By signoff = By.xpath("//a[contains(text(),'SIGN-OFF')]");
		
		dosendKey(userName,"zulfa013");
		dosendKey(password,"05071988");
		doClick(submit);
		doClick(signoff);
		closeBrowser();
		
//		getElement(userName).sendKeys("zulfa013");
//		getElement(password).sendKeys("05071988");
//		getElement(submit).click();
//		Thread.sleep(2000);
//		getElement(signoff).click();
//		driver.close();
		
//		driver.findElement(userName).sendKeys("zulfa013");
//		driver.findElement(password).sendKeys("05071988");
//		driver.findElement(submit).click();
//		Thread.sleep(2000);
//		driver.findElement(signoff).click();
//		driver.close();
			

	}
	public static WebElement getElement(By locator) {
	WebElement element=	driver.findElement(locator);
	return element;
	}
	public static void dosendKey(By locator, String Value) {
		getElement(locator).sendKeys(Value);
	}
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static void closeBrowser() {
		driver.close();
	}

}
