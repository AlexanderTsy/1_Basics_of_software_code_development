package by.jonline.basics01.loops;

public class Task5 {
	/* Циклы. Задание 5
	 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
	 * Общий член ряда имеет вид:
	 * an=1/2^n+1/3^n  
	 */
	 
	/*
	 * Поскольку члены данного ряда положительны, при сравнении с "e" модуль не вычисляем.
	 * Данный ряд представляет собой сумму двух бесконечно убывающих геометрических прогрессий с основаниями 1/2 и 1/3
	 * При n стремящемся к бесконечности сумма ряда равна 3,5.
	 */
	public static void main(String[] args) {
		double e = 1.0E-15;
		int n = 0; // номер члена ряда
		double sum = 0; // сумма ряда
		double a=0; // член ряда
		do {
			a=Math.pow(2, -n)+Math.pow(3, -n);
			sum+=a;
			n++;
		} while (a>=e);
		System.out.println("Cумма ряда для точности e="+e+" равна:");
		System.out.println(sum);
	}

}
