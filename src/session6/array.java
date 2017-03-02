/* PROGRAM IN ARRAY 
 * to enter an array and display using for loop 
 */
package session6;

// importing scanner for user input
import java.util.Scanner;

// creating a class array
public class array {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// defining an array number
		int[] number;
		// inititalizing size
		number = new int[10];
		System.out.println("ENTER THE NUMBERS");
		// for loop to enter array
		for (int i = 0; i < number.length; i++) {
			// for user input
			Scanner o = new Scanner(System.in);

			System.out.println("enter at " + (+i) + " position");
			number[i] = o.nextInt();

		}
		// for loop to print the value entered by the user
		for (int i = 0; i < number.length; i++) {
			System.out.println(" number entered by you are " + number[i]);
		}
		// logic to calculate even number for an array
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("\n");
				// displaying array
				System.out.println("even number entered by you " + number[i]);

			}
		}
	}

}
