package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchBrowser {
	
	WebDriver driver;
	
	public void firefoxdriver(){
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		
		
	}

	public void enterURL() {
		driver.get("https://www.google.com/");
		
	}

	public void getTittle() {
		String tittle = driver.getTitle();
		System.out.println("The Page Tittle is: "+tittle);
		
	}

	public void exitBrowser() {
		driver.quit();
		
	}

}
