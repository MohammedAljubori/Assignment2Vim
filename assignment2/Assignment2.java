 /* Author: Mohammed Aljubori
  * Date: September 17 2014
  * Algorithm:
  * 1. User enters 5 numbers
  * 2. User names desired operation
  * 3. Program computes desired operation
  */
package assignment2;
import java.util.Scanner;
public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Please enter 5 numbers:");
		Scanner keyboard = new Scanner(System.in);
		int[] nums = new int[5];
		for (int x = 0; x < 5; x++) {
			nums[x] = keyboard.nextInt();
		}
		/**
		 * The following would output the 5 numbers inputed by the user
		 */
		// for(int x= 0; x<5; x++)
		// {
		// System.out.print(nums[x]+" ");
		// }
		 /**
		 * Prompts user to select an operation
		 */
		System.out
				.println("Enter a number for an operation: \n 1: sum \n 2: average");
		int option = keyboard.nextInt();
		/**
		 * Finds the sum
		 */
		if (option == 1) {
			int ans = 0;
			for (int x = 0; x < 5; x++) {
				ans = ans + nums[x];
			}
			System.out.println("The sum is: " + ans);
		}
		/**
		 * Finds the average
		 */
		if (option == 2) {
			int ans = 0;
			for (int x = 0; x < 5; x++) {
				ans = ans + nums[x];
			}
			System.out.println("The average is: "+ans / 5);
		}
		// if (option == 3){
		//
		// }
		// if (option == 4){
		// int mode = 0;
		// for(int x = 0;x<5;x++)
		// {
		// for(int x2 = 0;x<5;x++){
		// if(nums[x2]==nums)
		// }
		//
		// }
		// }

	}
}
