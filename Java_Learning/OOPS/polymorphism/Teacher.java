package polymorphism;

public class Teacher extends Persons {
	
	@Override
	 void display() {
		 tittle = "Certified Tester";
		 name="Shukla";
		 age= 37;
		 
		 System.out.println("I am a Teacher");
		 System.out.println("Tittle: "+tittle);
		 System.out.println("Name: "+name);
		 System.out.println("Age: "+age+"\n");
		 
		 
	 }

}
