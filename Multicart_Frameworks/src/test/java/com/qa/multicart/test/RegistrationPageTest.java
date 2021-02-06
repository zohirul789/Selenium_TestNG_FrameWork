package com.qa.multicart.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.multicart.basePage.BasePage;
import com.qa.multicart.pageLayer.LoginPage;
import com.qa.multicart.pageLayer.RegistrationPage;

public class RegistrationPageTest extends BasePage {
	
	WebDriver driver;
	BasePage basepage;
	LoginPage loginpage;
	RegistrationPage registration;
	
	@BeforeTest
	public void setUp() {
		basepage = new BasePage();
		driver = basepage.initialize_driver("firefox");
		loginpage = new LoginPage(driver);	
		registration = loginpage.doSingUp();
		
	}
	@Test
	public void createAccountTest() {
		registration.accountRegistration("johir_2008@hotmail.com", "johir_2008", "Johir_2008",
				       						"Johir_2008", "johir", "uddin", "0009 100th st");
		
		
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
