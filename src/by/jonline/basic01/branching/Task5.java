package by.jonline.basic01.branching;

public class Task5 {
	/*
	 * Ветвления. Задача 5 Вычислить значение функции F(x) x^2-3x+9, если x<=3
	 * 1/(x^3+6), если x>3.
	 */
	
	/*
	 * Метод возвращает значение функции F(x) равное
	 * x^2-3x+9, если x<=3
	 * 1/(x^3+6), если x>3.
	 */
	public static double functionF(final double x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		} else {
			return 1 / (Math.pow(x, 3) + 6);
		}
	}

	public static void main(String[] args) {
		double x;	
		
		x = -1;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), 13));
		
		x = 3;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), 9));
		
		// double underflow - слишком маленькое значение для типа, равно 0
		x = 1e+200;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), "0.0, double underflow"));
		
		// результат близок к double overflow
		x = -1.340780743e+154;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), "число меньше Infinity"));
		
		// результат превышает double overflow = Infinity
		x = -2e+154;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), "Infinity, double overflow"));
		
		// double underflow - слишком маленькое значение для типа, равно 0
		x = Double.MAX_VALUE;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), "0.0, double underflow"));
		
		x = -Double.MAX_VALUE;
		System.out.println(String.format("F(%s)=%s должно быть %s", x, functionF(x), "Infinity, double overflow"));
	}

}
