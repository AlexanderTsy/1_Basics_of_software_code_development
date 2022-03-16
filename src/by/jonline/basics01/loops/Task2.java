package by.jonline.basics01.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
	/* Циклы. Задание 2
	 * Вычислить значения функции на отрезке [a,b] с шагом h:
	 * y=x, x>2
	 * y=-x, x<=2
	 */

	public static void main(String[] args) {
		// Declare variables
		double a=0;
		double b=0;
		double h=0; // calculations step
		double[][] result;
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
					System.err.println("Step size h have to be greater than zero. Please try again");
					isDataRead = false;
				}
			} catch (InputMismatchException exc) {
				System.err.println("Wrong input, please try again");
			}
		} while (!isDataRead);
		
		// calculating result array
		result = argumentValueArray(a, b, h);
		
		// printing result array to console
		for (int i=0; i<result.length; i++) {
			System.out.println("y("+result[i][0]+")="+result[i][1]);
		} 
		sc.close();
	}
	
	// calculates values of function
	private static double y(double x) {
		return (x<2)?x:-x;
	}
	
	// Method calculates values of function from a to b with step h and returns array of pairs (argument, value)
	private static double[][] argumentValueArray(double a, double b, double h){
		// The number of steps equals zero if h is bigger than ab length. So only values at a and b are stored.
		int steps = (int) (Math.abs((a-b)/h)); // calculate number of steps
		// if length of ab contains integer number of steps, last step will be the same as b
		// so subtracting steps by 1
		if ((Math.abs(a-b)-steps*h)==0) {  
			steps--;
		}
		// Declare array to store arguments and values of function.
		// values at a and b and number of steps values between 
		double[][] result = new double[steps+2][2];
		// store value of function at a
		result[0][0]= a;
		result[0][1]= y(a);
		// calculating value between a and b
		for (int i=1; i<=steps; i++) {
			// If a>b values are printed in descending order
			double x = a<b?(a+h*i):(a-h*i);
			result[i][0]=x;
			result[i][1]=y(x);
		}
		// store value of function at b
		result[result.length-1][0]= b;
		result[result.length-1][1]= y(b);
		return result;
	}

}
