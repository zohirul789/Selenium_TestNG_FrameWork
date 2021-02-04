import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver firefox = new FirefoxDriver();
		firefox.manage().window().maximize();
		firefox.get("https://www.google.com/");
		Thread.sleep(2000);
		
		String tittle = firefox.getTitle();
		System.out.println("The Page Tittle is: "+tittle);
		firefox.quit();

	}

}
