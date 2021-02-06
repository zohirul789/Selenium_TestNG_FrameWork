package com.qa.multicart.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.multicart.basePage.BasePage;
import com.qa.multicart.pageLayer.LoginPage;

public class LoginPageTest extends BasePage {
	// TestNG-- Unit Testing FrameWork use With java and Junit Also
	// Preconditons .....TestCase(Step).......Assertion....Close Test
	//@	BeforeTest.....@Test....Assertion....Close Browser
	// Lunch Browser,....URL...Title......verify...Close Browser
	
	WebDriver driver;
	BasePage basepage;
	LoginPage loginpage;
	
	@BeforeTest
	public void setUp() {
		basepage = new BasePage();
		driver = basepage.initialize_driver("firefox");
		loginpage = new LoginPage(driver);	
	}
	
	@Test(priority=1)
	public void verifySingUpLinks() {
		boolean expected=loginpage.isSignUpButtonExist();
		Assert.assertEquals(expected, true);
	}
	
	@Test(priority=2)
	public void verifyPageTitle() {
		String title=loginpage.getLoginPageTitle();
		System.out.println("Title is: "+title);
		Assert.assertEquals(title, "WildFire Cart");
	}
	
	@Test(priority=3)
	public void loginTest() {
		loginpage.doLogin("zulfa013", "Zulfa_013");
	}
	
	@Test(priority=4)
	public void logOutTest() {
		loginpage.doLogOut();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
