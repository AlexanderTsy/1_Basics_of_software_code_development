package by.jonline.basic01.linear;
/*
 * 1. Basics of software code development
 * Линейные программы Задание 2
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (b+sqrt(b^2+4ac))/2a-a^3c+b^-2
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task2 {

	/*
	 * Метод вычисляет значение выражения по формуле (b+sqrt(b^2+4ac))/2a-a^3c+b^-2
	 */
	public static double expressionValue(final double a, final double b, final double c) {
		if (a == 0) {
			System.err.println("Деление на 0, a=" + a);
		}
		if (b == 0) {
			System.err.println("Деление на 0, b=" + b);
		}
		return (b + sqrt(b * b + 4 * a * c)) / (2 * a) - pow(a, 3) * c + 1 / (b * b);
	}

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		String requiredResult; // результат

		// Тест 1
		a = 1;
		b = 2;
		c = 3;
		requiredResult = "0.25";   

		System.out.println(String.format("значение выражения для аргументов %s, %s, %s ", a, b, c));
		System.out.println(expressionValue(a, b, c)+" должно быть: "+requiredResult);
		
		// Тест 2		
		a = 1000;
		b = -5;
		c = 100;
		requiredResult = "-99999999999.6463";
		System.out.println(String.format("значение выражения для аргументов %s, %s, %s ", a, b, c));
		System.out.println(expressionValue(a, b, c)+" должно быть: "+requiredResult);
		
		// Тест 3
		a = Double.MAX_VALUE;
		b = 5;
		c = 2;
		// 0+Infinity=NaN
		requiredResult = "NaN";
		System.out.println(String.format("значение выражения для аргументов %s, %s, %s ", a, b, c));
		System.out.println(expressionValue(a, b, c)+" должно быть: "+requiredResult);
		
		// Тест 4. Деление на 0
		a = 1;
		b = 0;
		c = 3;
		requiredResult = "Infinity. Также выводится сообщение об ошибке";   

		System.out.println(String.format("значение выражения для аргументов %s, %s, %s ", a, b, c));
		System.out.println(expressionValue(a, b, c)+" должно быть: "+requiredResult);
	}
}