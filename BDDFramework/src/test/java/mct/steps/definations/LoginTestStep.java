package mct.steps.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginTestStep {
	WebDriver driver;
	
	@Given("I am Mct Website")
	public void i_am_mct_website() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

	}

	@When("I use the Login links")
	public void i_use_the_login_links() {
	  driver.findElement(By.xpath("//*[@id='dLabellogin']/span")).click();
	}

	@Then("I expect a complete Login form")
	public void i_expect_a_complete_login_form() {
		boolean isUserNameFieldExist=driver.findElement(By.id("username")).isDisplayed();
		Assert.assertEquals("User name field not found",true, isUserNameFieldExist);
		System.out.println("username: "+isUserNameFieldExist);
		boolean isPasswordFieldExist=driver.findElement(By.id("password")).isDisplayed();
		Assert.assertEquals("Password field not found",true, isPasswordFieldExist);
		System.out.println("password: "+isPasswordFieldExist);
		boolean isLoginButtonExist=driver.findElement(By.id("jqLogin")).isDisplayed();
		Assert.assertEquals("Login Button not found",true, isLoginButtonExist);
		System.out.println("loginbutton: "+isLoginButtonExist);
		
		

	}
	@Then("Enter username and password")
	public void enter_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("zulfa013");
	    driver.findElement(By.id("password")).sendKeys("Zulfa_0507");
	}

	@Then("Click on login Button")
	public void click_on_login_button() {
	    driver.findElement(By.id("jqLogin")).click();
	}
	@Then("close the Browse")
	public void close_the_browse() throws InterruptedException {
		Thread.sleep(3000);
	   driver.quit();
	}

}
