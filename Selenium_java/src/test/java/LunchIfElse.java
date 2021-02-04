import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LunchIfElse {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	    
		String browser="Chrome";
		
		if(browser.equals("Chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.close();
		}
		else if(browser.equals("Firefox")) {
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.close();
			
		}
		
		

	}

}
