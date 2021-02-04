package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath {
	
	
	//Absolute Xpath --> html/body/div/div/footer/p
	//Relative Xpath -->//footer/p
	
	@Test
	public void xpath() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uitestpractice.com/");
		driver.manage().window().maximize();
		
		String footerText=driver.findElement(By.xpath("html/body/div/div/footer/p")).getText();
		System.out.println(footerText);
		
		Thread.sleep(2000);
		String Header=driver.findElement(By.xpath("//div/h3")).getText();
		System.out.println(Header);
		
		Thread.sleep(2000);
		driver.close();
	}

}
