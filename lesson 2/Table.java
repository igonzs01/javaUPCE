//package programs;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		int num,num2;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Indicates the start value: ");
		num= input.nextInt();
		System.out.println("Indicates the end value: ");
		num2= input.nextInt();
		
		if(num<num2) {
			
			for(int i= num; i<=num2; i++) {
				System.out.print("-----");
			}
			System.out.println();
			for(int i=num; i<=num2; i++) {
				if(i==num) {
					System.out.println("   ");
				}
				System.out.printf("%4d", i);
			}
			System.out.println();
			for(int i= num; i<=num2; i++) {
				System.out.print("-----");
			}
			System.out.println();
			
			for(int i= num; i<=num2; i++) {
				System.out.printf("%4d", i);
				for(int j= num; j<=num2; j++) {
					System.out.printf("%4d",i*j);
				}
				System.out.println();
			}
			
		}else {
			System.out.println("Wrong values, try it again!");
		}
	}
}
