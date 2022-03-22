package by.jonline.basic01.loop;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
	/*
	 * Циклы. Задание 2 Вычислить значения функции на отрезке [a,b] с шагом h: y=x,
	 * x>2 y=-x, x<=2
	 */

	// calculates values of function
	private static double y(double x) {
		return (x < 2) ? x : -x;
	}
	
	/*
	 *  Method prints values of function y(x) within range [a,b] with step h
	 *  @param a range start
	 *  @param b range end
	 *  @param h step, greater than zero
	 */
	public static void printValues(double a, double b, double h) {
		// checking h > 0
		if (h <= 0)
		{
			System.err.println("Calculation step h have to be greater than zero.");
			return;
		} else {
			// checking if [a,b] range is ascending
			boolean isAscending = a < b;
			double x = a; // initializing x variable at range start
			do {
				System.out.println("y(" + x + ")=" + y(x));
				// if range is ascending x is increased, otherwise it's decreased by h
				x = (isAscending) ? x + h : x - h;
			} while (isAscending && x < b || !isAscending && x > b);
			// continue till b the end of range
			// printing value at b
			System.out.println("y(" + b + ")=" + y(b));
		}
	}
	
	// Convenience method to get double from console
	private static double getDoubleFromConsole(String message) {
		// using English locale for "." decimal separator
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		System.out.println(message);
		while(!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextDouble();
	}
	
	/*
	 * Step size h is supposed to be positive. If step h is greater than [a,b] range
	 * length, only values of function at a and b are returned
	 */

	public static void main(String[] args) {
		// Declare variables
		double a = 0; // range start
		double b = 0; // range finish
		double h = 0; // calculations step
		
		System.out.println("Testing h=0. Error message expected");
		printValues(0, 1, 0);
		
		// Read user input for variables a, b, h.
		System.out.println("Please input a, b and calculation step h");
		a = getDoubleFromConsole("Enter range start a >>");
		b = getDoubleFromConsole("Enter range end b >>");
		do {
			h = getDoubleFromConsole("Enter step h>0 >>");
		} while (h <= 0);
			
		printValues(a, b, h);

	}

}
