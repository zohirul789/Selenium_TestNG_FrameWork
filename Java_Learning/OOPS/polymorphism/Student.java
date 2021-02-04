package polymorphism;

public class Student extends Persons {
	
	@Override
	void display() {
		tittle = "QA Tester";
		name = "Zohirul Alom";
		age = 31;
		System.out.println("\t"+"I am a Student");
		System.out.println("\t"+"Tittle: "+tittle);
		System.out.println("\t"+"Name: "+name);
		System.out.println("\t"+"Age: "+age);
	}

}
