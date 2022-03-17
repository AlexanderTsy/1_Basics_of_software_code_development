package by.jonline.basic01.loop;

public class Task3 {
	/* Циклы Задание 3
	 * Найти сумму квадратов первых ста чисел.
	 */
	
	//предположим что имеется в виду сумма квадратов натуральных чисел от 1 до 100
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			sum+=i*i;
		}
		System.out.println("Сумма квадратов первых ста чисел равна:"+sum);
	}

}
