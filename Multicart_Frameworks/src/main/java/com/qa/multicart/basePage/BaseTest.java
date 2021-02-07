package com.qa.multicart.basePage;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.multicart.pageLayer.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public BasePage basepage;
	public LoginPage loginpage;
	public Properties propertie;
	
	@BeforeTest
	public void setUp() {
		basepage = new BasePage();
		propertie=basepage.initi_properties();
		String brow=propertie.getProperty("browser");
		driver = basepage.initialize_driver(brow);
		loginpage = new LoginPage(driver);	
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}


}
