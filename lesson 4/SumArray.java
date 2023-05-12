//package programs;

import java.util.Random;
import java.util.Scanner;

public class SumArray {

	public static void main(String[] args) {
		
		int row, column; 
		
		Scanner input= new Scanner(System.in); 
		
		System.out.println("Introduce a number for the rows: ");
		row= input.nextInt(); 
		System.out.println("Introduce a number for the colums: ");
		column= input.nextInt(); 
		
		//Calculate the random matrix and it
		int[][]array= randomArray(row, column);
		System.out.println("The firts array is: ");
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//Calculate the second random matrix and it
		int[][] array2= randomArray(row, column); 
		System.out.println("The second array is: ");
		for(int i=0; i<array2.length; i++) {
			for(int j=0; j<array2[0].length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		//Sum the matrixes
		int[][] result= matrixSum(array, array2); 
		
		//Print the result of the sum 
		matrixPrint(result); 
		
	}


	//Calculate the random numbers for the matrix
	private static int[][] randomArray(int row, int column) {
		int[][] array = new int[row][column]; 
		Random random= new Random(); 
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				array[i][j]= random.nextInt(10);  //numbers from 0 to 9
			}
		}
		return array;
	}
	
	
	//Sum the both matrixes
	private static int[][] matrixSum(int[][] array, int[][] array2) {
		int row= array.length; 
		int column= array[0].length; 
		int[][] result= new int[row][column]; 
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				result[i][j]= array[i][j] + array2[i][j]; 
			}
		}
		
		return result; 	
	}
	
	private static void matrixPrint(int[][] result) {
		System.out.println("The result of the sum is: ");
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

	
}
