package by.jonline.basic01.loop;

import java.math.BigInteger;

public class Task4 {
	/* Циклы. Задание 4
	 * Составить программу нахождения произведения квадратов первых двухсот чисел.
	 */
	
	// Рассчитаем произведение квадратов натуральных чисел от 1 до 200
	public static void main(String[] args) {
		//Поскольку искомое значение предположительно превысит диапазон типа long и double используем тип BigInteger
		BigInteger product;
		product = BigInteger.ONE;
		int i=1;
		while (i<=200) {
			product=product.multiply(BigInteger.valueOf(i*i));
			i++;
		}
		System.out.println("Произведение квадратов первых двухсот чисел равно:\r\n"+product);
		System.out.println("Количество знаков числа: "+product.toString().length());

	}

}
