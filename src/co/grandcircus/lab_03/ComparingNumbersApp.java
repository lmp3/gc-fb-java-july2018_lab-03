package co.grandcircus.lab_03;

import java.util.Scanner;

// Task: Lab 03 - Use conditional statements to automate the decision-making process.

public class ComparingNumbersApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int userNum;
	
		System.out.println("Enter a postive whole number between 1 and 100. :");
		userNum = input.nextInt();
		
		if (userNum >= 1 && userNum <= 100) {
			System.out.println("Your chosen number is " + userNum);
		}
			
		else {
			System.out.println(userNum + " is not a valid number.");
			System.exit(0);
		}
		
		if (userNum % 2 != 0) {
			System.out.println("Your number of " + userNum + " is an odd number.");
		}

		if (userNum % 2 != 0 && userNum >= 60) {
				System.out.println("Your number of " + userNum + " is an odd number and greater then 60.");
			}
		
		if (userNum % 2 == 0) {
			System.out.println("Your number of " + userNum + " is an even number.");
		}
		
		if (userNum % 2 == 0 && userNum <= 25) {
			System.out.println("Your number of " + userNum + " is an even number and less then 25.");
		}
		
		if (userNum % 2 == 0 && userNum >= 60) {
			System.out.println("Your number of " + userNum + " is an even number and greater then 60.");
		}
		
		System.exit(0);

		input.close(); // Stops Eclipse' "Resource leak" warning when using scanner.
		}
	}
	
