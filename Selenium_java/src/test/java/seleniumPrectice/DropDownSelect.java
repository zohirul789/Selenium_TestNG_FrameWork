package seleniumPrectice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelect {
	//static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("zulfa013");
		driver.findElement(By.name("password")).sendKeys("05071988");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
		Thread.sleep(2000);
		WebElement radio2 = driver.findElement(By.xpath("//input[@value=\"oneway\"]"));
		radio2.click();
		
		
		
		
		
//		//By userName = By.name("userName");
//		//By password = By.name("password");
//		//By submit = By.name("submit");
//		//By flight= By.xpath("//a[contains(text(),'Flights')]");
//		By type = By.name("tripType");
//			
//		driver.findElement(userName).sendKeys("zulfa013");;
//		driver.findElement(password).sendKeys("05071988");
//		driver.findElement(submit).click();
//		driver.findElement(flight).click();
//		Thread.sleep(2000);
//		
//		getElement(type).click();			
//		By country=By.name("country");
		//	DropDown Select
		/*	
		 * 	WebElement element=driver.findElement(country);
			Select select=new Select(element);
		*/
		
			//Simple Way to select DropDown list
			
		

/*	}
	public static WebElement getElement(By locator) {
		WebElement element =driver.findElement(locator);
		return element;
	}
//	public static void doselect(By locator, String value) {
//		Select select=new Select(getElement(locator));
//		select.selectByValue(value);
//		System.out.println(value);
//	}
*/
	}
}
