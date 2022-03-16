package by.jonline.basics01.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	/* Циклы. Задание 2
	 * Вычислить значения функции на отрезке [a,b] с шагом h:
	 * y=x, x>2
	 * y=-x, x<=2
	 */

	/* Step size h is supposed to be positive.
	 * If step h is greater than [a,b] range length,
	 * only values of function at a and b are returned
	 */
	
	public static void main(String[] args) {
		// Declare variables
		double a=0; //range start
		double b=0; //range finish
		double h=0; // calculations step
		
		Scanner sc = new Scanner(System.in);
		boolean isDataRead = false;
		
		// trying to read the data until it's read
		do {
			try {
				// Read user input for variables a, b, h.
				sc = new Scanner(System.in);
				System.out.println("Please input a, b and calculation step h");
				a = sc.nextDouble();
				b = sc.nextDouble();
				h = sc.nextDouble();
				isDataRead = true; // all the data have been read
				if (h<=0) {
					System.err.println("Step size h has to be greater than zero. Please try again");
					isDataRead = false;
				}
			} catch (InputMismatchException exc) {
				System.err.println("Wrong input, please try again");
			}
		} while (!isDataRead);
		// checking if [a,b] range is ascending
		boolean isAscending = a<b;
		double x=a; // initializing x variable at range start
		do {
			System.out.println("y("+x+")="+y(x));
			//if range is ascending x is increased, otherwise it's decreased by h
			x=(isAscending)?x+h:x-h;
		} while (isAscending && x<b || !isAscending && x>b); 
		// continue till b the end of range
		// printing value at b
		System.out.println("y("+b+")="+y(b));
		
		sc.close();
	}
	
	// calculates values of function
	private static double y(double x) {
		return (x<2)?x:-x;
	}
	
}
