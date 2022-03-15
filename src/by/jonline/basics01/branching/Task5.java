package by.jonline.basics01.branching;

import java.util.Scanner;

public class Task5 {
	/* Ветвления. Задача 5
	 * Вычислить значение функции F(x)
	 * x^2-3x+9, если x<=3
	 * 1/(x^3+6), если x>3.
	 */

	public static void main(String[] args) {
		double x;
		double result;
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите значение x");
		input = scanner.nextLine();
		try {
			x = Double.parseDouble(input);
			if (x<=3) {
				result = x*x-3*x+9;
			} else {
				result = 1/(Math.pow(x, 3)+6);
			}
			System.out.println(String.format("F(%s)=%s",x,result));
		} catch (NumberFormatException exc) {
			System.err.println("Убедитесь, что введено число. "+input);
		}
		scanner.close();
	}

}
