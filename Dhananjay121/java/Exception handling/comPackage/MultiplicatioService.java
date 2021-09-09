//Handle exception in number Problem statement: Get the input String from user and parse it to integer, 
//if it is not a number it will throw number format exception Catch it and print 
//"Entered input is not a valid format for an integer." or else print the square of that number. 

package comPackage;

import java.util.Scanner;

public class MultiplicatioService {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("java Entered input is not a valid format for an integer.");
		System.out.println("Enter the integer:");
		String stringNum = scan.nextLine();
		try {
			int intNum = Integer.parseInt(stringNum);

			System.out.println("The square is " + intNum * intNum);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("java Entered input is not a valid format for an integer.");
		}

	}
}
