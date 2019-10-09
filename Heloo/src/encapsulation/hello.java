package encapsulation;

//import encapsulation.Example_of_encapsulation;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_of_encapsulation obj= new Example_of_encapsulation();
		obj.setAge(10);
	
		//
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		

	}

	@Override
	public String toString() {
		return "hello [getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
