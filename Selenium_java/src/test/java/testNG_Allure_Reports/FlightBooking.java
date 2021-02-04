package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {
	
	static WebDriver driver;
	
	@Test
	public void bookOneWayTicket() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		By flight = By.xpath("//a[contains(text(),'Flights')]");
		By type = By.xpath("//input[@value='oneway']");
		By passenger = By.xpath("//select[@name='passCount']");
		By departingFrom = By.xpath("//select[@name='fromPort']");
		By month = By.xpath("//select[@name='fromMonth']");
		By day = By.xpath("//select[@name='fromDay']");
		By arrivingIN = By.xpath("//select[@name='toPort']");
		By serviceType = By.xpath("//input[@value='Business']");
		By arline = By.xpath("//select[@name='airline']");
		By clickONcontinue = By.xpath("//input[@type='image']");
		
		doClick(flight);
		doClick(type);
		selectValue(passenger,"2");
		selectValue(departingFrom,"New York");
		selectValue(month,"March");
		selectValue(day,"8");
		selectValue(arrivingIN,"London");
		doClick(serviceType);
		selectValue(arline,"Pangea Airlines");
		doClick(clickONcontinue);
		Thread.sleep(3000);
		closeBrowser();
	}
	
	public static WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	public static void doClick(By locator) {
		WebElement radiobtn=driver.findElement(locator);
		radiobtn.click();
	}
	public static void selectValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public static void closeBrowser() {
		driver.close();
	}

}
