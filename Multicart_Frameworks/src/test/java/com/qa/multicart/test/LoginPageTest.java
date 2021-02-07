package com.qa.multicart.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.multicart.basePage.BasePage;
import com.qa.multicart.basePage.BaseTest;
import com.qa.multicart.pageLayer.LoginPage;

public class LoginPageTest extends BaseTest {

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
		loginpage.doLogin(propertie.getProperty("username"),propertie.getProperty("password"));
	}
	
	@Test(priority=4)
	public void logOutTest() {
		loginpage.doLogOut();
	}
	

}
