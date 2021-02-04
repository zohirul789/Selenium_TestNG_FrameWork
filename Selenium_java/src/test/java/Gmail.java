import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        
        
        By email= By.xpath("//input[@id='identifierId']");
        By next= By.id("identifierNext");
        By password = By.xpath("//input[@type='password']");
        By sgin= By.id("passwordNext");
        
        Thread.sleep(2000);
        getElement(email).sendKeys("zulfa013@gmail.com");
        getElement(next).click();
        Thread.sleep(2000);
        getElement(password).sendKeys("Liza_0507");
        getElement(sgin).click();
        
        
        
        
    }
    
    public static WebElement getElement(By locator){
    
        WebElement element=driver.findElement(locator);
        return element;
    
    	}
    

	}


