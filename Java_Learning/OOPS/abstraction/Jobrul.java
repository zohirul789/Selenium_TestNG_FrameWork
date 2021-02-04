package abstraction;

public class Jobrul extends MobileUser {
	
	String name1 = "Jobrul: ";
	String Reply ="Kamrul: ";

	@Override
	void sendMessege() {
		System.out.println(name1+"\t Hi, I am Jobrul");
		
	}

	@Override
	void recived() {
		System.out.println(Reply+" Nice to meet you Jabrul");
		
		
	}

	@Override
	void call() {
		System.out.println(name1+"\t I will call you soon Kamrul");
		System.out.println("\n");
		
	}
	

}
