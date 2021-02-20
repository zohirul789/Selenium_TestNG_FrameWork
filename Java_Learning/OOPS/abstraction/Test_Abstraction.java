package abstraction;

import org.testng.annotations.Test;

public class Test_Abstraction {

	@Test
	public void test(){
		MobileUser mu;
		mu = new Jobrul();
		mu.sendMessege();
		mu.recived();
		mu.call();
		mu.end();
		
		mu = new Kamrul();
		mu.sendMessege();
		mu.recived();
		mu.call();
		mu.end();

	}

}
