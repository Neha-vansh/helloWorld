package encapsulation;



public class Example_of_encapsulation {
	
	private String name="neha";
	
/*	public Example_of_encapsulation(String name, int age) {
		
		this.name = name;
		this.age = age;
	}*/
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	int age;
	public void setName(String name) {
		this.name = name;
	}
	public boolean setAge(int age) {
		

		if (age>1)
		{
			this.age = age;
			return true;
		}
		return false;

	}

	
	

}
