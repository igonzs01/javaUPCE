//package programs;

import java.util.Scanner;

public class Output {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = input.nextLine();
		System.out.println("Enter your university");
		String university = input.nextLine();
		System.out.println("Enter your field of study");
		String studies = input.nextLine();
		
		System.out.println("Hello " + name + ", you study " + studies + " on " + university);

	}

}
