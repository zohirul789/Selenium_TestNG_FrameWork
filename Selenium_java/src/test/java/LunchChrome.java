import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("johir_789@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("Liza_0507");
		driver.findElement(By.name("login")).click();
		
		String actualtittle = driver.getTitle();
		System.out.println(actualtittle);
		
		driver.findElement(By.xpath("//i[@class='hu5pjgll op6gxeva sp_ptGYbOjBcMJ sx_537c73']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		driver.quit();

	}

}
