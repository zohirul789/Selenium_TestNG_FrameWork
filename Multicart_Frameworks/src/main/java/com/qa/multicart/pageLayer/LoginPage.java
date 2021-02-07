package com.qa.multicart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.multicart.basePage.BasePage;
import com.qa.multicart.utilites.ElementUtil;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	private ElementUtil elementutil;
	
	// By Locator
	
	By login = By.xpath("//*[@id=\"dLabellogin\"]/span");
	By userName = By.id("username");
	By passWord = By.id("password");
	By loginButton = By.id("jqLogin");
	By signUP = By.id("jqSignup");
	By zulfaislam = By.id("dLabel");
	By logOut = By.xpath("/html/body/div[1]/div[1]/nav/div[3]/div/div[3]/div/ul/li/div/div[2]/a");
	
	//Create Constructor of the page Class
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		elementutil = new ElementUtil(this.driver);
	}
	// Page Action
	
	public String getLoginPageTitle() {
		
/*		String title=driver.getTitle();
		return title;*/
		return elementutil.getPageTitle("WildFire Cart", 5);
		
	}
	
	public boolean isSignUpButtonExist() {
		driver.findElement(login).click();
		boolean status=driver.findElement(signUP).isDisplayed();
		return status;
/*		elementutil.waitForElementToBeClickable(login, 5);
		return elementutil.waitForElementToBeVisible(signUP, 5);
		*/
	}
	
	public void doLogin(String UserName, String PasWord) {
		driver.findElement(userName).sendKeys(UserName);
		driver.findElement(passWord).sendKeys(PasWord);
		driver.findElement(loginButton).click();
	}
	public void doLogOut() {
		driver.findElement(zulfaislam).click();
		driver.findElement(logOut).click();
	}
	public RegistrationPage doSingUp() {
		driver.findElement(login).click();
		driver.findElement(signUP).click();
		return new RegistrationPage(driver);
		
	}
	

}
