//package programs;

public class Student extends Person{  //inherits from the class person 

	private int idStudent; 
	
	//constructor 
	public Student(String name, int age, int idStudent) {
		super(name, age); 
		this.idStudent= idStudent; 
	}
	
	//get and set of idStudent
	public int getIdStudent() {
		return idStudent; 
	}
	
	public void setIdStudent(int idStudent) {
		this.idStudent= idStudent; 
	}

	@Override
	public String getRole() {
		return "Student";
	}
	
}
