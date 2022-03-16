package by.jonline.basics01.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task7 {
	/* Циклы. Задание 7
	 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
	 * m и n вводятся с клавиатуры
	 */
	
	public static void main(String[] args) {
		int m=0;
		int n=0;
		System.out.println("Введите два натуральных числа - границы промежутка:");
		boolean isInputOk = false;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				m = scanner.nextInt();
				n = scanner.nextInt();
				if (m<1 || n<1) {
					throw new InputMismatchException();
				}
				isInputOk = true;
				scanner.close();
			} catch (InputMismatchException e) {
				System.err.println("Неправильный ввод. Попробуйте еще раз. Введите два натуральных числа:");
				scanner = new Scanner(System.in); // создаем сканер заново для повторного ввода
				continue;
			}
		} while (!isInputOk);
		//если числа не в порядке возрастания, поменяем их местами
		int start = m<n?m:n;
		int finish = m<n?n:m;
		for (int i = start; i <= finish; i++) {
			printDevisors(i);
		}
	}
	
	private static void printDevisors(int i) {
		System.out.println("Делители для числа "+i+":");
		//проверяем делится ли без остатка на число кроме 1 и самого числа
		for (int j = 2; j < i; j++) {
			if(i%j==0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}
