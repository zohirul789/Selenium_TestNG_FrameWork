import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Newtours {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		By register= By.xpath("//a[contains(text(),'REGISTER')]");
		Thread.sleep(2000);
		//Contact Info
		By FirstName = By.name("firstName");
		By Lastname = By.name("lastName");
		By Phone = By.name("phone");
		By Email = By.id("userName");
		//Mailing info
		By Address = By.name("address1");
		By City = By.name("city");
		By State_Province = By.name("state");
		By PostalCode = By.name("postalCode");
		By Country = By.name("country");
		//User Info
		By userName = By.id("email");
		By password = By.name("password");
		By confirmPassword = By.name("confirmPassword");
		By submitQuery = By.name("submit");
		
		driver.findElement(register).click();
		driver.findElement(FirstName).sendKeys("Zulfa");
		driver.findElement(Lastname).sendKeys("Islam");
		driver.findElement(Phone).sendKeys("201225814");
		driver.findElement(Email).sendKeys("zulfa013@gmail.com");
		driver.findElement(Address).sendKeys("10109 75th st");
		driver.findElement(City).sendKeys("Ozone park");
		driver.findElement(State_Province).sendKeys("NY");
		driver.findElement(PostalCode).sendKeys("11152");
		//DropDwon Country Selection
		Select cntry = new Select(driver.findElement(Country));
		cntry.selectByValue("ARMENIA");
		driver.findElement(userName).sendKeys("zulfa013");
		driver.findElement(password).sendKeys("05071988");
		driver.findElement(confirmPassword).sendKeys("05071988");
		driver.findElement(submitQuery).click();
		driver.close();
		
	}

}
