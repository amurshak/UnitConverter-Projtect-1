package main;

import java.util.Scanner;


public class Converter {
	
	public static void main(String[] args) {
		boolean i = true;
		
		

		
		while(i==true) {
			System.out.println("Please select an option:");
			System.out.println("1. Cups to Teaspoons");
			System.out.println("2. Miles to Kilometers");
			System.out.println("3. Celcius to Fahrenheit");
			System.out.println("4. Quit");
			
			Scanner scanner = new Scanner(System.in);
			
			String menuSelection = scanner.next();
			
					
			switch(menuSelection) {
				case "4": i = false;
					break;
				case "1": 
					System.out.println("Enter cups to teaspoons conversion value:");
					Scanner cupToTeaspoon = new Scanner(System.in);
					float c2T = cupToTeaspoon.nextFloat()*48;
					System.out.println(c2T + " teaspoons");
					break;
					
				case "2":
					System.out.println("Enter miles to kilometers conversion value:");
					Scanner milesToKilometers = new Scanner(System.in);
					float m2K = milesToKilometers.nextFloat()*1.60934f;
					System.out.println(m2K + " kilometers");
					
				case "3":
					System.out.println("Enter celcius to fahrenheit conversion value:");
					Scanner celciusToFahrenheit = new Scanner(System.in);
					float c2F = celciusToFahrenheit.nextFloat()*(9/5)+32;
					System.out.println(c2F + " fahrenheit");
					

			}
	        
	        
			
		}
	}
}
