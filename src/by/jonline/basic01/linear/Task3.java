package by.jonline.basic01.linear;
/*
 * 1. Basics of software code development
 * Линейные программы Задание 3
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения):
 * (sin x + cos y)/(cos x - sin y)*tg(xy)
 */

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

import java.util.Scanner;

public class Task3 {

	/*
	 * Method calculates the value of expression (sin x + cos y)/(cos x - sin
	 * y)*tan(xy) x, y being real values in degrees
	 */
	public static double valueOfExpression(final double x, final double y) {
		return (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
	}

	/*
	 * Convenience method to get double from console with message prompt
	 */
	private static double getDoubleFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextDouble();
	}

	public static void main(String[] args) {

		// variables
		double x;
		double y;
		double expectedResult;

		System.out.println("Values of expression (sin x + cos y)/(cos x - sin y)*tg(xy)");
		System.out.println("Console input");
		x = getDoubleFromConsole("x (real number) >>");
		y = getDoubleFromConsole("y (real number) >>");
		System.out.println("Console input x=" + x + " y=" + y + " value=" + valueOfExpression(x, y));

		System.out.println("Test cases");

		// Test 1
		x = 90d / 180 * Math.PI;
		y = 0;
		expectedResult = 0;
		System.out.println("Test1. x=" + x + " y=" + y + " actual res=" + valueOfExpression(x, y) + " expected res="
				+ expectedResult);

		// Test 2
		x = 0;
		y = 90d / 180 * Math.PI;
		expectedResult = Double.NaN; // 0/0*0 = NaN
		System.out.println("Test2. x=" + x + " y=" + y + " actual res=" + valueOfExpression(x, y) + " expected res="
				+ expectedResult);

		// Test 3
		x = 30d / 180 * Math.PI;
		y = 30d / 180 * Math.PI;
		expectedResult = 1.04959187557691;
		System.out.println("Test3. x=" + x + " y=" + y + " actual res=" + valueOfExpression(x, y) + " expected res="
				+ expectedResult);
	}
}