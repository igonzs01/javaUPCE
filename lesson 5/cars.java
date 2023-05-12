//package programs;

import java.util.Scanner;

public class cars {

	public static void main(String[] args) {
		int rows; 
		
		Scanner input= new Scanner(System.in);
		System.out.println("Introduce how much cars you want to sort: ");
		rows= input.nextInt(); 
		String[][] carsArray= new String[rows][2]; 
		
		for(int i=0; i<carsArray.length; i++) {
			System.out.println("Now, introduce car brands: ");
			String brand= input.next(); 
			carsArray[i][0]= brand; 
			
			System.out.println("Introduce the mileage of each car: ");
			String mileage= input.next(); 
			carsArray[i][1]= mileage; 
		}
		
		System.out.println("\nGenerated matrix:");
        for (int i = 0; i < carsArray.length; i++) {
            System.out.println(carsArray[i][0] + "\t" + carsArray[i][1]);
        }
		
        for(int i=0; i<rows-1; i++) {
        	for(int j=0; j<rows-1-i; j++) {
        		if(Integer.parseInt(carsArray[j][1])< Integer.parseInt(carsArray[j+1][1])) {
        			String[] aux= carsArray[j]; 
        			carsArray[j]= carsArray[j+1]; 
        			carsArray[j+1]= aux; 
        		}
        	}
        }
        
        System.out.println("\nSort matrix:");
        for (int i = 0; i < carsArray.length; i++) {
        	
        	System.out.println(carsArray[i][0] + "\t" + carsArray[i][1]);

        }     
        	
	}

}
