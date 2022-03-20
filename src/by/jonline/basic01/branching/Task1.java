package by.jonline.basic01.branching;

import java.util.Scanner;

public class Task1 {
	// Ветвления. Задание 1
	// Даны два угла треугольника (в градусах). Определить, существует ли такой
	// треугольник,
	// и если да, то будет ли он прямоугольным.

	public static boolean checkTriangleExist(float angle1, float angle2) {
		/*
		 * Сумма углов треугольника равна 180 градусов. Следовательно сумма двух углов
		 * не превышает 180. Каждый угол больше 0 и меньше 180 градусов.
		 */
		return (angle1 > 0 && angle1 < 180 && angle2 > 0 && angle2 < 180 && angle1 + angle2 < 180);
	}
	
	public static boolean checkRightTriangle(float angle1, float angle2) {
		/* треугольник будет прямоугольным, если один из углов равен 90
		 * или сумма двух углов равна 90 
		 */
		return ( angle1==90 || angle2 == 90 || (angle1 + angle2) == 90);
	}
	
	// Предположим что пользователь вводит величину угла в градусах с клавиатуры,
	// используем тип float для этих значений
	private static float enterFloatFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(message);
		while (!scanner.hasNextFloat()) {
			scanner.next();
			System.out.println(message);
		}
		return scanner.nextFloat();
	}
	
	// Выводит в консоль описание треугольника с углами angle1 и angle2
	public static void reportTriangle (float angle1, float angle2) {
		System.out.println(String.format("Введенные углы %f, %f", angle1, angle2));
		if (checkTriangleExist(angle1, angle2)) {
			System.out.println("Треугольник существует");
			
			if (checkRightTriangle(angle1, angle2)) {
				System.out.println("Треугольник является прямоугольным");
			} else {
				System.out.println("Треугольник не является прямоугольным");
			}
		} else {
			System.out.println("Треугольник не существует.");
		}
	}

	
	
	public static void main(String[] args) {
		float angle1;
		float angle2;
		String message="Введите величину угла в градусах от 0 до 180";
		angle1 = enterFloatFromConsole(message);
		angle2 = enterFloatFromConsole(message);
		
		System.out.println("Данные введены пользователем");
		reportTriangle(angle1, angle2);
		
		System.out.println("Тест 1. Прямоугольный треугольник, один из передаваемых углов прямой"); 
		angle1 = 90;
		angle2 = 20;
		
		reportTriangle(angle1, angle2);
		
		System.out.println("Тест 2. Прямоугольный треугольник, сумма углов 90"); 
		angle1 = 23.555f;
		angle2 = 66.445f;
		
		reportTriangle(angle1, angle2);
		
		System.out.println("Тест 3. Один из углов больше 180"); 
		angle1 = 181f;
		angle2 = 15f;
		
		reportTriangle(angle1, angle2);
		
		System.out.println("Тест 4. Один из углов меньше 0, сумма двух 90"); 
		angle1 = -10f;
		angle2 = 100f;
		
		reportTriangle(angle1, angle2);
		
	}

}
