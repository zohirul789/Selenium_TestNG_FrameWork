package com.qa.multicart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.multicart.basePage.BasePage;

public class RegistrationPage extends BasePage {
	
	private WebDriver driver;
	
	//By locator
	By Email = By.id("txtEmail");
	By UserName = By.id("txtUserName");
	By Password = By.id("txtCnfPassword");
	By CoinfirmPassword = By.id("txtCnfPassword");
	By FirstName = By.id("txtFirstName");
	By LastName = By.id("txtLastName");
	By Address = By.xpath("//input[@placeholder='Address *']");
	By CreatAccount = By.id("btnRegister");
	
	//class constructor method
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void accountRegistration(String email,String username,String password,String confirmPassword,
			String firstName,String lastName,String address) {
		driver.findElement(Email).sendKeys(email);
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(CoinfirmPassword).sendKeys(confirmPassword);
		driver.findElement(FirstName).sendKeys(firstName);
		driver.findElement(LastName).sendKeys(lastName);
		driver.findElement(Address).sendKeys(address);
		driver.findElement(CreatAccount).click();
		
		
	}

}
