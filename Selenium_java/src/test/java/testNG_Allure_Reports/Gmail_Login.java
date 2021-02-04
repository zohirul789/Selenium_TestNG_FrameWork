package testNG_Allure_Reports;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_Login {
	
	static WebDriver driver;
	
	@Test(priority=1)
	public void gLogin() throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/");
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        
        Utilitys utl = new Utilitys(driver);
        driver.findElement(By.name("proceed")).click();
        Alert alt=utl.waitForAlertToBePresent(5);
        System.out.println(alt.getText());
        alt.accept();
        
        
        
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
        //closeBrowser();
        driver.close();
        
        
        
        
    }
    
    public static WebElement getElement(By locator){
    
        WebElement element=driver.findElement(locator);
        return element;
    
    	}

    
	}


