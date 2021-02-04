package seleniumPrectice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectionDD {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		
		By choice = By.cssSelector("span.comboTreeItemTitle");
		
		selectMultiChoic(choice, "All");
		
		
		
		

		
		
		
//		Thread.sleep(2000);
//		driver.close();

	}
	public static void selectMultiChoic(By locator,String... value) {
		List<WebElement>multiSelection =driver.findElements(locator);
		if(!value[0].equals("All")) {
			for(int i =0;i<multiSelection.size();i++) {
				String text=multiSelection.get(i).getText();
				
				for(int j=0;j<value.length;j++)
				if(text.equals(value[j]) ){
					multiSelection.get(i).click();
					break;
					}
				}
			}
		else {
			try {
				for(int all=0;all<multiSelection.size();all++) {
					multiSelection.get(all).click();
				}
				
			}catch(Exception e) {
				
			}	
		}
	}
}
	
		
	
	




