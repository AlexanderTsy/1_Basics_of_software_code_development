package by.jonline.basics01.linear;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		//Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		// (sin x + cos y)/(cos x - sin y)*tg(xy)
		// Консольное приложение вычисляет значение выражения и помощью пакета java.lang.Math, значения x и y пользователь вводит с клавиатуры
		double x;
		double y;
		double result;
		//создадим объект типа java.util.Scanner для считывания пользовательского ввода
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Будет вычислено значение выражения (sin x + cos y)/(cos x - sin y)*tg(xy)");
		System.out.println("Введите значение х (действительное число)");
		x = scanner.nextDouble();
		System.out.println("Введите значение y (действительное число)");
		y = scanner.nextDouble();
		
		result = (sin(x)+cos(y))/(cos(x)-sin(y))*tan(x*y);
		
		System.out.println("значение выражения: "+result);
		
		scanner.close();
		
	}
}
