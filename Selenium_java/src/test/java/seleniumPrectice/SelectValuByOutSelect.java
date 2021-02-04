package seleniumPrectice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValuByOutSelect {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
				
		By month=By.id("month");
		By day=By.id("day");
		By year=By.id("year");
		
		
		Thread.sleep(2000);
		selectValueFromDropDown(driver,month,"May");
		selectValueFromDropDown(driver,day,"25");
		selectValueFromDropDown(driver,year,"1988");
		

	}
	public static void selectValueFromDropDown(WebDriver driver,By locator,String value) {
		List<WebElement> daylist=driver.findElements(locator);
		System.out.println(daylist.size());
		for(int i=0;i<daylist.size();i++) {
			String day1=daylist.get(i).getText();
			if(day1.equals(value)) {
				daylist.get(i).click();
				break;
			}
		}
		
	}

}
