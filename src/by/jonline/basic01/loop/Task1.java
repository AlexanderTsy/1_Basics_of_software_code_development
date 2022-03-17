package by.jonline.basic01.loop;

import java.util.InputMismatchException;
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
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		boolean isNumberOk = false;
		do {
			System.out.println("Введите положительное целое число, не более 2147483647");
			try {
				number = scanner.nextInt();
				if (number > 0 && number <= 2147483647) {
					isNumberOk = true;
				} else {
					throw new InputMismatchException();
				}
			} catch (InputMismatchException e) {
				System.err.println("Неправильный ввод, попробуйте еще раз.");
				continue;
			}
		} while (!isNumberOk);
		long sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
	}

}
