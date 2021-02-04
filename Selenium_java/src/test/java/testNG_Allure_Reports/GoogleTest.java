package testNG_Allure_Reports;

import org.testng.annotations.Test;

import google.LunchBrowser;

public class GoogleTest extends LunchBrowser {
	
	@Test
	public void verifyGoogle() {
		LunchBrowser tp = new LunchBrowser();
		tp.firefoxdriver();
		tp.enterURL();
		tp.getTittle();
		tp.exitBrowser();
		
		
	}

}
