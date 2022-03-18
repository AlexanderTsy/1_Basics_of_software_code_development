package by.jonline.basic01.branching;

public class Task2 {
	// Ветвления. Задание 2
	// Найти max{min(a,b), min(c,d)}
	
	public static void main(String[] args) {
	
		// Тестовые данные 1
		double a = -150.5846054;
		double b = 56048.0;
		double c = 12;
		double d = 64;
		System.out.println(String.format("max{min(%s,%s), min(%s,%s)} равно: %s", a,b,c,d,findMaxOfMin(a,b,c,d)));
		// Тестовые данные 2
		a = 1;
		b = 900;
		c = -1;
		d = 65;
		System.out.println(String.format("max{min(%s,%s), min(%s,%s)} равно: %s", a,b,c,d,findMaxOfMin(a,b,c,d)));
	}
	
	/*
	 * Метод находит max{min(a,b), min(c,d)}
	 */
	public static double findMaxOfMin(double a, double b, double c, double d) {
		//запишем в x min(a,b)
		double x = a<b?a:b;
		//запишем в y min(c,d)
		double y = c<d?c:d;
		//найдем результат max{x,y}
		return x>y?x:y;
	}

}
