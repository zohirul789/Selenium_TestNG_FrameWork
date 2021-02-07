package com.qa.multicart.basePage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	private WebDriver driver;
	private Properties propertie;
	
	// This Method Initialize the Browser & Driver
	public WebDriver initialize_driver(String browserName) {
		System.out.println("Browser Name is: "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
		}
		else {
			System.out.println("Browser Not Found Please Pass The Proper Name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(propertie.getProperty("url"));
		return driver;
			
	}
	public Properties initi_properties() {
		propertie = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\zohir\\git\\SeleniumTestNG\\Multicart_Frameworks\\src\\main\\java\\com\\qa\\multicart\\properties\\config.properties");
			propertie.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertie;
		
		
		
		
	}

}
