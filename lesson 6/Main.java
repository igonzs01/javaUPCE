//package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student student;
		Teacher teacher; 
		Course course; 
		String name, courseName;
		int age, id; 
		int option; 
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Write the name of the course: ");
		courseName= input.nextLine(); 
		course= new Course(courseName); 

		
		do{
			System.out.println("1.Add a student\n2.Add a teacher\n3.Show the lists\n4.End the program\n");
			option= input.nextInt(); 
			if(option == 1) {
				System.out.println("Write the student´s name: ");
				name= input.next(); 
				System.out.println("Write the student´s age: ");
				age= input.nextInt(); 
				System.out.println("Write the student´s ID: ");
				id= input.nextInt(); 
				student= new Student(name, age, id); 
				course.addStudent(student);
				
			}else if(option == 2) {	
				System.out.println("Write the teacher´s name: ");
				name= input.next(); 
				System.out.println("Write the teacher´s age: ");
				age= input.nextInt(); 
				System.out.println("Write the teacher´s ID: ");
				id= input.nextInt(); 
				teacher= new Teacher(name, age, id); 
				course.addTeacher(teacher);
				
			}else if(option == 3) {
				if(course.getListStudent().size()>0) {
					ArrayList<Student> listStudent= course.getListStudent(); 
					for(Student e : listStudent) {
						System.out.println(e.getRole()+": "+e.getName()+"("+e.getAge()+") "+e.getIdStudent()+" enrolled in "+course.getNameCourse());
					}
				}
				if(course.getListTeacher().size()>0) {
					ArrayList<Teacher> listTeachers= course.getListTeacher(); 
					for(Teacher e : listTeachers) {
						System.out.println(e.getRole()+": "+e.getName()+"("+e.getAge()+") "+e.getIdTeacher()+" enrolled in "+course.getNameCourse());
					}
				}
			}else if(option==4){
				return; 
			}else {
				System.out.println("Option not valided! Try again");
			}
		}while(true); 

	}

}
