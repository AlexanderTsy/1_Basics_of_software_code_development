package by.jonline.basic01.loop;

import java.util.Scanner;

public class Task1 {
	/*
	 * Циклы. Здание 1 Напишите программу, где пользователь вводит любое целое
	 * положительное число. А программа суммирует все числа от 1 до введенного
	 * пользователям числа.
	 */

	/*
	 * Ограничим пользоавтельский ввод типом int, максимальное число 2 147 483 647.
	 * результат вычислений сохраним в тип long.
	 * если значение передаваемого числа меньше либо равно 0 возвращаем 0
	 */
	public static long sumOneToN(int num) {
		//проверка входных данных
		if (num <= 0) {
			System.err.println("переданное значение "+num+" меньше либо равно 0");
			return 0;
		}
		
		long sum = 0;
		// нельзя испльзовать int для переменной цикла из-за переполнения, цикл никогда не завериштся
		for (long i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
	
	/*
	 * 
	 */
	private static int getIntFromConsole (String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println(message);
		}
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		
		int number;
		
		boolean isNumberOk = false;
		
		do {
			number = getIntFromConsole("Введите положительное целое число, не более 2147483647");
			if (number > 0 && number <= 2147483647) {
				isNumberOk = true;
			}
		} while (!isNumberOk);
		
		System.out.println("Ввод с клавиатуры");
		System.out.println("Сумма чисел от 1 до " + number + " равна " + sumOneToN(number));
		
		System.out.println("\nТест 1");
		number = -100;
		System.out.println("Сумма чисел от 1 до " + number + " равна " + sumOneToN(number));
		
		System.out.println("\nТест 2");
		number = Integer.MAX_VALUE;
		System.out.println("Сумма чисел от 1 до " + number + " равна " + sumOneToN(number));
		
		System.out.println("\nТест 3");
		number = 1000000;
		System.out.println("Сумма чисел от 1 до " + number + " равна " + sumOneToN(number));
	}

}
