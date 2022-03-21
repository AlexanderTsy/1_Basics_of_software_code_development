package by.jonline.basic01.linear;
/*
 * 1. Basics of software code development
 * Линейные программы Задание 4
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {

	/*
	 * Метод принимает действительное число R вида nnn.ddd (три цифровых разряда в
	 * дробной и целой частях) Возвращает число ddd.nnn Сделаем допущение, что числа
	 * вида 0nn.0dd будут преобразовываться к виду dd.0nn
	 * 
	 * TODO возможно следует решать задачу в строковом представлении, проверяя что nnn и ddd
	 * являются цифрами разделенными точкой
	 */
	public static float changeDigits(final float R) {
		String rString; // строковое представление числа R
		rString = Float.toString(R);

		if (rString.length() == 7 && rString.substring(3,4).contentEquals(".")) {
			return Float.parseFloat(rString.substring(4, 7) + "." + rString.substring(0, 3));

		} else {
			System.err.println("Не верный формат числа R=" + R + " Должно быть число вида nnn.ddd");
			return 0;
		}
	}

	public static void main(String[] args) {
		float r; // число R

		System.out.println("Test 1");
		r = 111.222f;
		System.out.println(r + " - " + changeDigits(r));
		
		System.out.println("Test 2");
		r = 123.321f;
		System.out.println(r + " - " + changeDigits(r));
				
		System.out.println("Test 3");
		r = 011.220f;
		System.out.println(r + " - " + changeDigits(r));
		
		System.out.println("Test 4");
		r = 000.000f;
		System.out.println(r + " - " + changeDigits(r));
		
		System.out.println("Test 5");
		r = 100.001f;
		System.out.println(r + " - " + changeDigits(r));
				
	}
}
