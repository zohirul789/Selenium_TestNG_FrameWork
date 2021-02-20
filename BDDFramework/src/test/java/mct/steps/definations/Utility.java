package mct.steps.definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility {
	public WebDriver driver;
	
	public  WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}
	public  WebElement doClick(By locator) {
		WebElement radiobtn=driver.findElement(locator);
		radiobtn.click();
		return radiobtn;
	}
	public  void selectValue(By locator,String value) {
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	public  void closeBrowser() {
		driver.close();
	}

}
