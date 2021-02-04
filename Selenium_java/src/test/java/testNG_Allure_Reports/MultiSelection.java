package testNG_Allure_Reports;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelection {
	
	static WebDriver driver;
	
	@Test
	public void selectMultipleCheckbox() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
		By choice = By.cssSelector("span.comboTreeItemTitle");
		
		selectAllCheckBox(choice,"all");
		
	}
	public static void selectAllCheckBox(By locator, String... value) throws InterruptedException {
		
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
		Thread.sleep(2000);
		driver.close();
		
	}

}
