//package programs;

public class Teacher extends Person{
	
private int idTeacher; 
	
	//constructor 
	public Teacher(String name, int age, int idStudent) {
		super(name, age); 
		this.idTeacher= idStudent; 
	}
	
	//get and set of idStudent
	public int getIdTeacher() {
		return idTeacher; 
	}
	
	public void setIdStudent(int idStudent) {
		this.idTeacher= idStudent; 
	}

	@Override
	public String getRole() {
		return "Teacher";
	}
	
}
