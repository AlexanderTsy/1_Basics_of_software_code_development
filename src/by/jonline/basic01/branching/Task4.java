package by.jonline.basic01.branching;

import java.util.Arrays;

public class Task4 {
	/* Ветвления. Задание 4
	 * Заданы размеры A, B прямоугольного отверстия и размеры x,y,z кирпича.
	 * Определить, пройдет ли такой кирпич через отверстие.
	 */
	
	/*
	 * Метод проверки пройдет ли кирпич через прямоугольное отверстие
	 * 
	 * @param sizeA, sizeB размеры отверстия
	 * 
	 * @param x, y, z размеры кирпича
	 * 
	 * @return true когда кирпич проходит через отверстие
	 * 				Кирпич пройдет через отверстие, если меньший размер
	 * 				кирпича будет меньше либо равен меньшему размеру
	 * 				отверстия, а средний размер кирпича
	 * 				будет меньше либо равен большему размеру отверстия.
	 */
	public static boolean checkBrickFitsHole(int sizeA, int sizeB, int x, int y, int z) {
		int pointsA = 0;
		int pointsB = 0;
		
		// проверка входных данных. Размеры должны быть больше 0
		if (sizeA <=0 || sizeB <= 0 || x <= 0 || y <= 0 || y <= 0) {
			System.err.println("Размеры отверстий и кирпича должны быть больше 0");
			// TODO возможно лучше выбросить исключение
			return false;
		}
		
		// подсчитаем сколько размеров кирпича меньше либо равны A
		pointsA = ((sizeA - x)>=0?1:0) + ((sizeA - y)>=0?1:0) + ((sizeA - z)>=0?1:0);
		// 3 отбрасываем, поскольку проверяем чтобы по крайней мере 2 размера были меньше А 
		pointsA = pointsA == 3 ? 2 : pointsA;
		
		// подсчитаем сколько размеров кирпича меньше либо равны B
		pointsB = ((sizeB - x)>=0?1:0) + ((sizeB - y)>=0?1:0) + ((sizeB - z)>=0?1:0);
		// 3 отбрасываем, поскольку проверяем чтобы по крайней мере 2 размера были меньше B
		pointsB = pointsB == 3 ? 2 : pointsB;
		
		// если по крайней мере 2 размера кирпича в одном случае и 1 размер кирпича
		// в другом случае меньше размера отверстия, то кирпич пройдет 
		return pointsA + pointsB >= 3;
			
	}
	
	/*
	 * Метод для удобства вывода результата при тестировании
	 */
	private static void printResult(int sizeA, int sizeB, int x, int y, int z) {
		String res;
		
		// если кирпич проходит записываем в res пустую строку "", иначе " не"
		res = checkBrickFitsHole(sizeA, sizeB, x, y, z)?"":" не";
		System.out.println(String.format("Кирпич размером %s x %s x %s в отверстие %s x %s%s пройдет", 
				x,y,z, sizeA, sizeB, res));
	}

	public static void main(String[] args) {
		// размеры отверстия
		int sizeA;
		int sizeB;
		// размеры кирпича
		int x;
		int y;
		int z;
		
		System.out.println("Тест1. Кирпич не должен пройти");
		sizeA = 100;
		sizeB = 150;
		// Зададим размеры кирпича
		x = 50;
		y = 153;
		z = 380;
		printResult(sizeA, sizeB, x, y, z);
		
		System.out.println("Тест2. Отрицательные размеры");
		sizeA = -100;
		sizeB = 150;
		// Зададим размеры кирпича
		x = 50;
		y = 149;
		z = 380;
		printResult(sizeA, sizeB, x, y, z);
		
		System.out.println("Тест3. Кирпич проходит");
		sizeA = 100;
		sizeB = 150;
		// Зададим размеры кирпича
		x = 50;
		y = 149;
		z = 380;
		printResult(sizeA, sizeB, x, y, z);
		
		System.out.println("Тест4. Большое отверстие и кирпич. Кирпич проходит");
		sizeA = Integer.MAX_VALUE+1;
		sizeB = 150;
		// Зададим размеры кирпича
		x = Integer.MAX_VALUE;
		y = 149;
		z = 380;
		printResult(sizeA, sizeB, x, y, z);
		
		System.out.println("Тест5. Большое отверстие и кирпич. Переполнение типа, переход в отрицательные значения");
		sizeA = Integer.MAX_VALUE+1;
		sizeB = 150;
		// Зададим размеры кирпича
		x = Integer.MAX_VALUE;
		y = 149;
		z = 380;
		printResult(sizeA, sizeB, x, y, z);

	}

}
