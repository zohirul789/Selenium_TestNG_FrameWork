import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {
	
	static String expectedTitle="YouTube";
	static String expectedURL = "https://www.youtube.com";

	public static void main(String[] args) throws InterruptedException {
		
		// Setup driver for windows
		System.setProperty("webdriver.firefox.driver","C:\\\\Users\\\\zohir\\\\geckodriver-Firefox\\\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.com");
		
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title is : "+actualtitle);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL is: "+currentURL);
		
		if(actualtitle.equals(expectedTitle)) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Title is Wrong");
		}
		if(currentURL.contains(expectedURL)) {
			System.out.println("Current URL is Right");
		}
		else {
			System.out.println("Current URL is Wrong");
		}
		
		// wait 3 seconds
		Thread.sleep(3000);
		
		driver.close();

	}

}
