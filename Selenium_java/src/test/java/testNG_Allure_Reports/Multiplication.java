package testNG_Allure_Reports;

import org.testng.annotations.Test;

public class Multiplication {
	
	@Test
	public void usingLOOP() {
		
		for(int i=1;i<=10;i++) {
			System.out.println("\t");
			
			for(int j = 1;j<=10;j++) {
				System.out.println("\t");
				System.out.println(i+"*"+j+"="+i*j+"\t");
				
			}
		}
	}

}
