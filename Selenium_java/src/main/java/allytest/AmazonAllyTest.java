package allytest;

import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.deque.axe.AXE;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonAllyTest {
	
	WebDriver driver;
	private static final URL scriptUrl = AmazonAllyTest.class.getResource("/axe.min.js");
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	@Test
	public void test() {
		
		JSONObject jo = new AXE.Builder(driver, scriptUrl).analyze();
		JSONArray ja = jo.getJSONArray("ja");
	
		 
		 if (ja.length() == 0) {
			 System.out.println("no violation");
		 
		 }
		 else {
		    AXE.writeResults("test", jo);
		    Assert.assertTrue(false, AXE.report(ja));
		 }
		}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
