//Program that prompts a user to guess a magic number between 0 and 100 that matches the generated number

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 101);
		//System.out.println(number);
		
		
		
		//prompt the user to enter a number
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		
		int guess = -1;
		while(guess != number) {
			
			System.out.print("Enter a number:");
			guess = input.nextInt();
			
			if (guess == number) {
				System.out.println("Correct Guess: The number is "+ number);
				break;
			}
			else if (guess > number) {
				System.out.println("Guess too high: try again!");
			}
			
			else if (guess < number) {
				System.out.println("Guess too low: Try again!");
			}
		}
	}

}
