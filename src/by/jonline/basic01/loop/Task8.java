package by.jonline.basic01.loop;

import java.math.BigDecimal;

public class Task8 {
	/* Циклы. Задание 8
	 * Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа
	 */
	
	/*
	 * Предположим что числа могут быть как целыми, так и с десятичными дробями.
	 * Для того чтобы хранить числа точно используем тип BigDecimal
	 * Можно было бы использовать просто строковое представление, но тогда строка могла бы не быть числом.
	 */
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("18490498798740.4590");
		BigDecimal b = new BigDecimal("9009494.0127658590789868");
		System.out.println("Первое число: "+a.toPlainString());
		System.out.println("Второе число: "+b.toPlainString());
		System.out.println("Цифры, входящие в запись как первого, так и второго числа:");
		for (int i=0; i<10; i++) {
			String s = Integer.toString(i); //преобразуем цифру в строку для поиска в числах
			// если цифра есть и в первой и во второй записи числа, то выводим эту цифру
			if (a.toPlainString().indexOf(s)>-1 && b.toPlainString().indexOf(s)>-1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();

	}

}
