package SimpleEvenetListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_title {
	
	@Test
	public void understandingListener() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver event_driver= new EventFiringWebDriver(driver);
		MyTestListener testListener = new MyTestListener();
		event_driver.register(testListener);
		
		event_driver.manage().window().maximize();
		event_driver.get("https://www.facebook.com/");
		event_driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		event_driver.quit();
	}

}
