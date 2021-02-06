package com.qa.multicart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.multicart.basePage.BasePage;

public class LoginPage extends BasePage {
	
	private WebDriver driver;
	
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
	}
	// Page Action
	
	public String getLoginPageTitle() {
		
		String title=driver.getTitle();
		return title;
		
	}
	
	public boolean isSignUpButtonExist() {
		driver.findElement(login).click();
		boolean status=driver.findElement(signUP).isDisplayed();
		return status;
		
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
