package encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.SetName("German Shaferd");
		System.out.println("The Dog Name is: "+d.GetName());
		
		d.SetAge(35);
		System.out.println("The Dog Age is: "+d.GetAge());

	}

}
