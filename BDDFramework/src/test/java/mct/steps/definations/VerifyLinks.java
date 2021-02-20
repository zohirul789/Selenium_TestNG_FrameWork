package mct.steps.definations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLinks {
	
	WebDriver driver;
	
	@Given("Lunch the Browser")
	public void lunch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions co = new ChromeOptions();
	    co.addArguments("--headless");
	    driver = new ChromeDriver(co);
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}

	@When("Verify available Links of the pages")
	public void verify_available_links_of_the_pages() {
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    
	    int total =links.size();
	    System.out.println(total);
	    
	    for(int i = 0;i<total;i++) {
	    	String availableLinks=links.get(i).getText();
	    	System.out.println(availableLinks);
	    	if(!availableLinks.isEmpty()) {
	    		System.out.println("Links Name Are: "+availableLinks);
	    	}
	    }
	}

	@Then("Tear Down the Browser")
	public void tear_down_the_browser() throws InterruptedException {
		Thread.sleep(2000);
	    driver.close();
	}

}
