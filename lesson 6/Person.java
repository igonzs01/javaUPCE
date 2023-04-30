//package programs;

public abstract class Person {
	
	private String name; 
	private int age; 
	
	//constructor
	public Person(String name, int age) {
		this.name= name; 
		this.age= age; 
	}
	
	//get and set of name
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name= name; 
	}
 	
	//get and set of age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age; 
	}
	
	public abstract String getRole();
	
	
}
