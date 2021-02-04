package seleniumPrectice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserConcepts {
	static String expextedTitle="Google";
	static String expectedURL="https://www.google.com/?gws_rd=ssl";

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//setup for not to lunch Browser
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com/");
		String actualtitle=driver.getTitle();
		System.out.println("Actual Title is : "+actualtitle);
		
		if(actualtitle.equals(expextedTitle)) {
			System.out.println("Title is Correct");
		}
		else {
			System.out.println("Title is Wrong");
		}
		
		String currentURL=driver.getCurrentUrl();
		System.out.println("Current URL IS: "+currentURL);
		
		if(currentURL.contains(expectedURL)) {
			System.out.println("URL is Correct");
		}
		else {
			System.out.println("URL is Wrong");
			}

	}

}
