//package programs;

import java.util.ArrayList;

public class Course {  //relationship of association with the class Student
	
	private String name; 
	private ArrayList<Student> listStudent; 
	private ArrayList<Teacher> listTeacher; 
	
	
	//constructor
	public Course(String name) {
		this.name= name; 
		this.listStudent= new ArrayList<Student>(); 
		this.listTeacher= new ArrayList<Teacher>();
	}
	
	//get and set of course´s name
	public String getNameCourse(){
		return name; 
	}
	
	public void setNameCourse(String name) {
		this.name= name; 
	}
	
	
	//add a student to the list
	public void addStudent(Student student) {
		listStudent.add(student); 
	}

	//get the student list
	public ArrayList<Student> getListStudent(){
		return listStudent; 
	}
	
	//add a teacher to the list
	public void addTeacher(Teacher teacher) {
		listTeacher.add(teacher); 
	}

	//get the teacher list
	public ArrayList<Teacher> getListTeacher(){
		return listTeacher; 
	}

}
