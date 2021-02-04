package allureReports;

import javax.sound.midi.MetaEventListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureRepoting {
	
	@Test
	public void validateTitle() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		String tittle = driver.getTitle();
		System.out.println("The Page Tittle is: "+tittle);
		driver.quit();
		
	}

}
