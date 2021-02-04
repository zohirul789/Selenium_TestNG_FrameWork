package abstraction;

import org.testng.annotations.Test;

public class Test_Abstraction {

	//public static void main(String[] args) 
	@Test
	public void test(){
		MobileUser mu;
		mu = new Jobrul();
		mu.sendMessege();
		mu.recived();
		mu.call();
		
		mu = new Kamrul();
		mu.sendMessege();
		mu.recived();
		mu.call();

	}

}
