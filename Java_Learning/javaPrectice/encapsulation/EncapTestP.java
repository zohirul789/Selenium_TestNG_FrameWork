package encapsulation;

public class EncapTestP {

	public static void main(String[] args) {
		
		Persons p = new Persons();
		
		p.SetName("Zohirul Alom");
		System.out.println("Person Name: "+p.GetName());
		
		p.SetAge(32);
		System.out.println("Person Age: "+p.GetAge());
		
		p.SetEmail("zohirul789@yahoo.com");
		System.out.println("Person Email: "+p.GetEmail());
		
		
		

	}

}
