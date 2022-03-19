package by.jonline.basic01.branching;

import static java.lang.Math.abs;

public class Task3 {
	// Ветвления. Задание 3
	// Даны три точки A(x1,y2), B(x2,y2), C(x3,y3)
	// Определить, будут ли они расположены на одной прямой.
	
	// Для решения задачи воспользуемся уравнением прямой, проходящей через две точки:
	// (y-y1)/(y2-y1)=(x-x1)/(x2-x1)
	// Если точка C(x3,y3), принадлежит прямой AB,
	// то равенство (y3-y1)*(x2-x1)=(x3-x1)*(y2-y1) будет верным.
	// Если точки совпадают, будем считать что они находятся на одной прямой.
	
	/*
	 * Метод проверяет расположены ли три точки на одной прямой
	 * threshold влияет на точность метода
	 */
	public static boolean checkThreePointsOnTheSameLine(double x1, double y1, double x2, double y2, double x3, double y3, double threshold) {
		if (abs(x1 - x2) < threshold && abs(x1 - x3) < threshold) {
			return true; //вертикальная линия
		}
		if (abs(y1 - y2) < threshold && abs(y1 - y3) < threshold) {
			return true; //горизонтальная линия
		}
		return abs((y3-y1)/(y2-y1)-(x3-x1)/(x2-x1)) < threshold;
	}

	public static void main(String[] args) {
		//Переменные
		double threshold = 0.000000001; //точность
		//координаты
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		//результат
		boolean result;
		
		// Тестовые данные 1. Прямая под углом 45 градусов
		threshold = 0.000000001;
		x1 = 1;
		y1 = 1;
		x2 = 2;
		y2 = 2;
		x3 = 3;
		y3 = 3;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);
		// используем строковый формат %s вместо %f, чтобы не было преобразования по
		// локальных настройкам десятичного разделителя.
		// если точки не на одной прямой - вставим частицу "не"
		System.out.println("Test 1: "+String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, result ? "" : " не"));

		// Тестовые данные 2. Вертикальная прямая x=0. Не на одной прямой, поскольку |x2-x1|>=threshold
		threshold = 1e-100;
		x1 = 0;
		y1 = 1.5e+100;
		x2 = 2.1e-100;
		y2 = 2.1e-100;
		x3 = 0;
		y3 = 5;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);
		System.out.println("Test 2: "+String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, result ? "" : " не"));

		// Тестовые данные 3. Горизонтальная прямая y=10. На одной прямой, поскольку |y3-y1|<threshold
		threshold = 0.0000000001;
		x1 = 5e+100;
		y1 = 10;
		x2 = 1e-100;
		y2 = 10;
		x3 = 2;
		y3 = 10.00000000009;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);
		System.out.println("Test 3: "+String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, (result ? "" : " не")));

	}
	
	

}
