//package programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		 
		int dimensions;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter the dimension of the array");
		dimensions= input.nextInt();
		int[] array = new int[dimensions];
		
		System.out.println("Enter the numbers according to the dimension");
		for(int i=0; i<array.length; i++) {
			array[i]= input.nextInt(); 
		}
		
		System.out.println("The array created is: ");
		System.out.print("[");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("]");
		System.out.println();
		
		
		//Ascending order with bubble sort
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					int aux= array[j]; 
					array[j]= array[j+1]; 
					array[j+1]= aux;
				}
			}
		}
		System.out.println();
		System.out.println("The array in ascending order is: " + Arrays.toString(array));
		
		
		//Descending order with bubble sort
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j]<array[j+1]) {
					int aux= array[j]; 
					array[j]= array[j+1]; 
					array[j+1]= aux; 
				}
			}
		}
		System.out.println("The array in descending order is: " + Arrays.toString(array));

	}
}
