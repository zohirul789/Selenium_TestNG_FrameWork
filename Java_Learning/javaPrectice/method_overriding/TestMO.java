package method_overriding;

public class TestMO {

	public static void main(String[] args) {
		Wife w = new Wife();
		
		w.name="Majada Bahar";
		w.age=26;
		w.qualification="House Wife";
		w.DisplayInformation();
		
		System.out.println("\n"+"******************"+"\n");
		
		Husband h = new Husband();
		h.name="Zohirul Alom";
		h.age=32;
		h.DisplayInformation();

	}

}
