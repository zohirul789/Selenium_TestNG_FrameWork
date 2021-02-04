package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverUtil {
	
	@Test
	public void TestUtil() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		By UserName = By.xpath("//input[@name='userName']");
		By Password = By.xpath("//input[@name='password']");
		By Submit = By.xpath("//input[@name='submit']");
		
		Utilitys utl= new Utilitys(driver);
		
		utl.waitForElementToBePresent(UserName, 10).sendKeys("zulfa013");
		utl.waitForElementToBePresent(Password, 5).sendKeys("05071988");
		utl.waitForElementToBeClickable(Submit, 5).click();;	
		
		driver.close();
	}
	

}
