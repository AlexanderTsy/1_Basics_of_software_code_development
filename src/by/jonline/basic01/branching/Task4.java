package by.jonline.basic01.branching;

import java.util.Arrays;

public class Task4 {
	/* Ветвления. Задание 4
	 * Заданы размеры A, B прямоугольного отверстия и размеры x,y,z кирпича.
	 * Определить, пройдет ли такой кирпич через отверстие.
	 */
	
	/* Кирпич пройдет через отверстие, если меньший размер кирпича будет меньше либо равен меньшему размеру отверстия,
	 * а средний размер кирпича будет меньше либо равен большему размеру отверстия.
	 */

	public static void main(String[] args) {
		// Зададим размеры отверстия
		int sizeA = 100;
		int sizeB = 150;
		// Меньшей и больший размеры отверстия
		int minHoleSize;
		int maxHoleSize;
		
		if (sizeA>sizeB) {
			maxHoleSize = sizeA;
			minHoleSize = sizeB;
		} else {
			maxHoleSize = sizeB;
			minHoleSize = sizeA;
		}
		
		// Зададим размеры кирпича
		int x = 50;
		int y = 153;
		int z = 380;
		// поместим размеры в массив
		int[] dimensions = {x,y,z};
		// упорядочим массив
		Arrays.sort(dimensions);
		String res;
		// если кирпич проходит записываем в res пустую строку "", иначе " не"
		res = (dimensions[0]<=minHoleSize && dimensions[1]<=maxHoleSize)?"":" не";
		System.out.println(String.format("Кирпич с размерами %s x %s x %s%s пройдет в отверстие %s x %s", 
				x,y,z, res, sizeA, sizeB));

	}

}
