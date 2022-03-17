package by.jonline.basic01.branching;

public class Task2 {
	// Ветвления. Задание 2
	// Найти max{min(a,b), min(c,d)}
	
	// Запишем исходные данные в теле программы
	private static double a = -150.5846054;
	private static double b = 56048.0;
	private static double c = 12;
	private static double d = 64;
	
	public static void main(String[] args) {
		//запишем в x min(a,b)
		double x = a<b?a:b;
		//в y min(c,d)
		double y = c<d?c:d;
		// max{x,y}
		double result = x>y?x:y;
		System.out.println(String.format("max{min(%s,%s), min(%s,%s)} равно: %s", a,b,c,d,result));
	}

}
