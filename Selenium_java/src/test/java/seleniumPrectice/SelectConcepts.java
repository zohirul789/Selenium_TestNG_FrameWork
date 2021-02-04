package seleniumPrectice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectConcepts {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		//Click on CreatNewAccount Button
		By CreatNewAccount = By.id("u_0_2");
		
		//Select Birthday
		By month=By.id("month");
		By day=By.id("day");
		By year=By.id("year");
		
		//Gender
		By female=By.className("_58mt");
		
		selectRadioButton(CreatNewAccount);
		Thread.sleep(3000);
		doSelect(month,"Apr");
		doSelect(day,"2");
		doSelect(year,"1998");
		Thread.sleep(2000);
		selectRadioButton(female);
		closeBrowser();
		
		

	}
	public static void doSelect(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public static  WebElement getElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static void selectRadioButton(By locator) {
		WebElement radiobtn=driver.findElement(locator);
		radiobtn.click();

		
	}
	public static void closeBrowser() {
		driver.close();
	}
	
	

}
