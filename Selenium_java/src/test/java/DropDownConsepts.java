import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownConsepts {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		//Select Birthday
		By month=By.id("month");
		By day=By.id("day");
		By year=By.id("year");
		
		List<String> getMonthList=getDropDown(month);
		System.out.println(getMonthList);
		
		List<String> dayList=getDropDown(day);
		System.out.println(dayList);
		
		List<String> yearList=getDropDown(year);
		System.out.println(yearList);
		
		closeBrowser();
		
		
//		Thread.sleep(2000);
//		WebElement radiobtn=driver.findElement(By.className("_58mt"));
//		radiobtn.click();
//		boolean selected=radiobtn.isSelected();
//		System.out.println(selected);
	}
	public static WebElement GetElement(By locator) {
		WebElement element=driver.findElement(locator);
		return element;
	}
	public static List<String> getDropDown(By locator) {
		List<String> optionList = new ArrayList<String>();
		Select select = new Select(GetElement(locator));
		List<WebElement> elements = select.getOptions();
		//System.out.println(elements.size());
		for(WebElement webElement : elements) {
			String text=webElement.getText();
			optionList.add(text);		
			}
		return optionList;
	}
	public static void closeBrowser() {
		driver.close();
	}

}
