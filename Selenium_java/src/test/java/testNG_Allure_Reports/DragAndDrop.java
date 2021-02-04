package testNG_Allure_Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	@Test
	public void dragAndDropAction() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement targetElemet= driver.findElement(By.id("droppable"));
		
		Actions ac=new Actions(driver);
		//ac.clickAndHold(sourceElement).moveToElement(targetElemet).release().build().perform();
		
		ac.dragAndDrop(sourceElement, targetElemet).perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
