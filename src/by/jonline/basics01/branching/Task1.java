package by.jonline.basics01.branching;

import java.util.Scanner;

public class Task1 {
	// Ветвления. Задание 1
	// Даны два угла треугольника (в градусах). Определить, существует ли такой
	// треугольник,
	// и если да, то будет ли он прямоугольным.

	// Предположим что пользователь вводит через пробел значения двух углов,
	// используем тип float для этих значений
	public static void main(String[] args) {
		String input;
		String[] inputSplit;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите через пробел значения двух углов. Десятичный разделитель точка \".\"");
		// разделим ввод через пробел
		input = scanner.nextLine();
		try {
			inputSplit = input.split("\\s+");
			float angle1 = Float.parseFloat(inputSplit[0]);
			float angle2 = Float.parseFloat(inputSplit[1]);
			// Каждый угол треугольника больше 0 и меньше 180 градусов.
			// Сумма углов треугольника равна 180 градусов. Следовательно сумма двух углов
			// не превышает 180.
			if (angle1 > 0 && angle1 < 180 && angle2 > 0 && angle2 < 180 && angle1 + angle2 < 180) {
				System.out.println("Треугольник существует");
				// Если треугольник прямоугольный, то один из его углов равен 90 градусов,
				// следовательно сумма оставшихся должна быть равна 90 градусов.
				if ((angle1 + angle2) == 90.0) {
					System.out.println("Треугольник является прямоугольным");
				} else {
					System.out.println("Треугольник не является прямоугольным");
				}
			} else {
				System.out.println("Треугольник с углами " + input + " не существует.");
			}
		} catch (NumberFormatException numExc) {
			System.err.println("Не удается преобразовать в числа введенные данные. Вы ввели: " + input);
		} catch (ArrayIndexOutOfBoundsException arrayExc) {
			System.err.println("Убедитесь, что введенные числа разделены пробелом. Вы ввели: " + input);
		}
	}

}
