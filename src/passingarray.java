/* name: Jamil Matheny 
 * date: 08/15/2020 
 * Passing an array to a function in object-oriented programming */


import java.util.Scanner;

public class passingarray {
		
	public static void main(String[] args) {
		
		// declarations
		int i, j;

		float[] num = new float[100];
		float count = 0.0f, avg;
		
		
		System.out.print("Enter the number of scores: "); // Prompts the user how many number of scores to calculate the total average.
		i = STDIN_SCANNER.nextInt(); // Standard input from the Scanner java library.
		
		
		
		while(i > 100 || i < 1) { /* While loop uses the 'or' operator to suggest if the integer is less than 100 or greater than 1. */
			System.out.print("Error: There should be a number in the range of 1 to 100!\n"); /* This is in case the user, when prompted to enter a number between 1 and 100, this line will output a request for the integer between 1 and 100. */
			System.out.print("Please enter the number again: "); // Prompts the user again... haha! :)
			i = STDIN_SCANNER.nextInt();
		}
		
		for(j = 0; j < i; ++j) { /* The for loop is to declare the integer j to list the order of numbers from 1-100 when the user enters the scores. */
			System.out.print((j + 1) + ". Enter number: "); // Prompts the user to enter the scores.
			num[j] = STDIN_SCANNER.nextFloat();
			count += num[j]; 
		}

		avg = count / j; // assigns the variable average to count divided by j.
		System.out.printf("\n Average total = %.2f", avg); // outputs the average total 
	}

	private final static Scanner STDIN_SCANNER = new Scanner(System.in);
}