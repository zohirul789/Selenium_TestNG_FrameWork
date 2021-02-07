package com.qa.multicart.utilites;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	
	private WebDriver driver;
	private JavaScriptUtil jsUtil;
	

	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
		//jsUtil= new JavaScriptUtil();
	}

	public WebElement waitForElementToBePresent(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public WebElement waitForElementToBeClickable(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		
	}
	
	public WebElement getElement(By locator) {
		WebElement element;
		element =driver.findElement(locator);
		return element;
	}
	
	public WebElement waitForElementToBeVisible(By locator, int timeout) {
		
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
		
	}
	public String getPageTitle(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	public String getPageURL(String URL, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(URL));
		return driver.getCurrentUrl();
	}
	public List<WebElement> waitForVisivleOFallElements(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public Alert waitForAlertToBePresent(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	//***********************This is my Action Class Method*******************
	public  void actionsSendkeys(By locator,String value) {
		Actions ac = new Actions(driver);
		ac.sendKeys(getElement(locator),value).perform();
		
	}
	public  void actionsClick(By locator) {
		Actions ac = new Actions(driver);
		ac.click(getElement(locator)).perform();
	}
	//********This is My DropDown Class Method****************
	public  List<String> getDropDown(By locator) {
		List<String> optionList = new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> elements = select.getOptions();
		//System.out.println(elements.size());
		for(WebElement webElement : elements) {
			String text=webElement.getText();
			optionList.add(text);		
			}
		return optionList;
	}
	public  void selectRadioButton(By locator) {
		WebElement radiobtn=driver.findElement(locator);
		radiobtn.click();

		
	}
	public  void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public  void doClick(By locator) {
		getElement(locator).click();
	}
	public  void doSignoff(By locator) {
		getElement(locator).click();

	}
	public  void doSelect(By locator, String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	//Drop Down Select class method
	public static void selectValueFromDropDown(WebDriver driver,By locator,String value) {
		List<WebElement> daylist=driver.findElements(locator);
		System.out.println(daylist.size());
		for(int i=0;i<daylist.size();i++) {
			String day1=daylist.get(i).getText();
			if(day1.equals(value)) {
				daylist.get(i).click();
				break;
			}
		}
		
	}
	public  void selectAllCheckBox(By locator, String... value) throws InterruptedException {
		
		List<WebElement> multiCheckBox=driver.findElements(locator);
		if(!value[0].equals("all")) {
			for(int i = 0;i<multiCheckBox.size();i++) {
				String text=multiCheckBox.get(i).getText();
				
				for(int j=0;j<value.length;j++) {
					if(text.equals(value[j])) {
						multiCheckBox.get(i).click();
						break;
						
					}
					
				}
			}
			
		}else {
			try {
				for(int all=0;all<multiCheckBox.size();all++) {
					multiCheckBox.get(all).click();
				}
			}catch(Exception e) {
				
			}
			
		}
		
	}

}
