package encapsulation;

public class Dog {
	private String name;
	private int age;
	
	public String GetName() {
		return name;
		
	}
	public void SetName(String name) {
		this.name=name;
		
		
	}
	public int GetAge() {
		return age;
	}
	public void SetAge(int age) {
		this.age=age;
	}

}
