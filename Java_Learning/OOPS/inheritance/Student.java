package inheritance;

public class Student extends Person {
	
	String qualification;
	
	void DisplayInformation1() {
		DisplayInformation();
		System.out.println("Qualification: "+qualification);
	}

}
