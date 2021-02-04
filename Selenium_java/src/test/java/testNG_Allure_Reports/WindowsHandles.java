package testNG_Allure_Reports;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandles {
	
	@Test
	public void getWindowsHandles() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		
		System.out.println("Before Click ........");
		System.out.println("Number of the windows opened by select "+driver.getWindowHandles().size());
		
		for(String windows:driver.getWindowHandles()) {
			System.out.println(windows);
			
		}
		
		System.out.println("After Click.......");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Opens in a new window")).click();
		System.out.println("Number of the windows opened by select "+driver.getWindowHandles().size());
		
		for(String windows:driver.getWindowHandles()) {
			System.out.println(windows);
			
		}
		
		ArrayList<String> newTab=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTab.get(1));
		
		/*String dragables=driver.findElement(By.id("draggable")).getText();
		System.out.println(dragables);*/
		
		WebElement sourceElement= driver.findElement(By.id("draggable"));
		WebElement targetElemet= driver.findElement(By.id("droppable"));
		
		System.out.println("Drag"+sourceElement);
		System.out.println("Drop"+targetElemet);
		
		Actions ac=new Actions(driver);
		//ac.clickAndHold(sourceElement).moveToElement(targetElemet).release().build().perform();
		
		ac.dragAndDrop(sourceElement, targetElemet).perform();
		
		String currentWindow=driver.getWindowHandle();
		System.out.println(currentWindow);
		
		driver.close();
		
		System.out.println("After Close the Current Window............");
		System.out.println("Number of the windows opened by select "+driver.getWindowHandles().size());
		
		for(String windows:driver.getWindowHandles()) {
			System.out.println(windows);
			
		}
		Thread.sleep(2000);
		driver.switchTo().window(newTab.get(0));
		System.out.println("Current window:"+driver.getWindowHandle());
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
