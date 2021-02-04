package method_overriding;

public class Wife extends Husband {
	
	String qualification;
	@Override
	void DisplayInformation() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Qualification: "+qualification);
	}
	
	

}
