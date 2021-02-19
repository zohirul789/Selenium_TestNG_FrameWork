package mct.steps.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BookOnwayFlight extends Utility {
	WebDriver driver;
	
	@Given("Open the Browser and navigate to App")
	public void open_the_browser_and_navigate_to_app() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
	}

	@When("Click on flight")
	public void click_on_flight() throws InterruptedException {
	   driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
	   Thread.sleep(5000);

		

	}

	@Then("Provide the information")
	public void provide_the_information() throws InterruptedException {
		
		
		By type = By.xpath("//input[@value='oneway']");
		By passenger = By.xpath("//select[@name='passCount']");
		By departingFrom = By.xpath("//select[@name='fromPort']");
		By month = By.xpath("//select[@name='fromMonth']");
		By day = By.xpath("//select[@name='fromDay']");
		By arrivingIN = By.xpath("//select[@name='toPort']");
		By serviceType = By.xpath("//input[@value='Business']");
		By arline = By.xpath("//select[@name='airline']");
		
		
		Thread.sleep(2000);
		doClick(type);
		selectValue(passenger,"2");
		selectValue(departingFrom,"New York");
		selectValue(month,"March");
		selectValue(day,"8");
		selectValue(arrivingIN,"London");
		doClick(serviceType);
		selectValue(arline,"Pangea Airlines");
		
	}

	@Then("Click on continue button")
	public void click_on_continue_button() {
	    System.out.println("Click on Continue Button");
	}

	@Then("Close the Browser")
	public void close_the_browser() {
		closeBrowser();
	}



}
