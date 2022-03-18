package by.jonline.basic01.branching;

public class Task3 {
	// Ветвления. Задание 3
	// Даны три точки A(x1,y2), B(x2,y2), C(x3,y3)
	// Определить, будут ли они расположены на одной прямой.
	
	// Для решения задачи воспользуемся уравнением прямой, проходящей через две точки:
	// (y-y1)/(y2-y1)=(x-x1)/(x2-x1)
	// Если точка C(x3,y3), принадлежит прямой AB,
	// то равенство (y3-y1)*(x2-x1)=(x3-x1)*(y2-y1) будет верным.
	// Если точки совпадают, будем считать что они находятся на одной прямой. 

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
		
		// Тестовые данные 1
		threshold = 0.000000001;
		x1 = 1.5e+100;
		y1 = 1.5e+100;
		x2 = 2.1e-100;
		y2 = 2.1e-100;
		x3 = 1.0000000000000001d;
		y3 = 1.0000000000000001d;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);

		// используем строковый формат %s вместо %f, чтобы не было преобразования по
		// локальных настройкам десятичного разделителя.
		// если точки не на одной прямой - вставим частицу "не"
		System.out.println(String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, result ? "" : " не"));

		// Тестовые данные 2
		threshold = 1e-100;
		x1 = 1.5e+100;
		y1 = 1.5e+100;
		x2 = 2.1e-100;
		y2 = 2.1e-100;
		x3 = 1;
		y3 = 5;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);
		System.out.println(String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, result ? "" : " не"));

		// Тестовые данные 3
		threshold = 0.0000000001d;
		x1 = 1.5e+100;
		y1 = 1.5e+100;
		x2 = 2.1e-100;
		y2 = 2.1e-100;
		x3 = 2.0000000000000002d;
		y3 = 1.0000000000000001d;

		result = checkThreePointsOnTheSameLine(x1, y1, x2, y2, x3, y3, threshold);
		System.out.println(String.format("Точки A(%s,%s) B(%s,%s) C(%s,%s)%s расположены на одной прямой.", x1, y1, x2,
				y2, x3, y3, (result ? "" : " не")));

	}
	
	/*
	 * Метод проверяет расположены ли три точки на одной прямой
	 * threshold влияет на точность метода
	 */
	public static boolean checkThreePointsOnTheSameLine(double x1, double y1, double x2, double y2, double x3, double y3, double threshold) {
		return (y3-y1)*(x2-x1)-(x3-x1)*(y2-y1) < threshold;
	}

}
