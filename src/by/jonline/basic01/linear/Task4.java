package by.jonline.basic01.linear;

import java.util.Scanner;

public class Task4 {
	// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
	// целой частях).
	// Поменять местами дробную и целую части числа и вывести полученное значение
	// числа.

	// Сделаем допущение, что числа вида 0nn.0dd будут преобразовываться к виду
	// dd.0nn
	public static void main(String[] args) {
		// число запросим у пользователя через консоль.
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String input;
		float result;

		// используем регулярное выражение как паттерн для проверки правильности ввода
		// пользователя.
		String pattern = "\\d{3}\\.\\d{3}";
		do {
			System.out.println("Введите число R вида nnn.ddd (три цифровых разряда в дробной и целой частях)");
			input = scanner.next();
			if (input.matches(pattern)) {// проверяем формат ввода
				result = Float.parseFloat(input.substring(4, 7) + "." + input.substring(0, 3));// составляем новое чило
																								// и записываем его в
																								// переменную result
				System.out.println(result);
				break;
			} else {
				System.out.println("Ошибка ввода, убедитесь что ввели число вида nnn.ddd");
			}
		} while (true);
	}
}
