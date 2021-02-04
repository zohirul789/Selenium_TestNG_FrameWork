package polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Persons p = new Persons();
		p.display();
		
		p = new Teacher();
		p.display();
		
		p = new Student();
		p.display();

	}

}
