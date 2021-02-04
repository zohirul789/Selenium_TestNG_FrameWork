package abstraction;

public class Kamrul extends MobileUser {
	
	String name2 = "Kamrul: ";
	String Reply = "Jabrul: ";

	@Override
	void sendMessege() {

		System.out.println(name2+"\t Hi, I am kamrul");
		
	}

	@Override
	void recived() {
		System.out.println(Reply+" Nice to meet you Kamrul");
		
	}

	@Override
	void call() {
		System.out.println(name2+"\t I will call you too Jabrul");
		
	}

}
