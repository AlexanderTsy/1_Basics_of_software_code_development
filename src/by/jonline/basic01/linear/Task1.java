package by.jonline.basic01.linear;

/*
 * 1. Basics of software code development
 * Линейные программы Задание 1
 * Найдите значение функции: z =((a-3)*b/2)+c
 */

public class Task1 {
	
	/*
	 *  @return z =((a-3)*b/2)+c
	 */
	public static double functionZ(final double a, final double b, final double c) {
		return ((a-3)*b/2)+c;
	}
	
    public static void main(String[] args) {
        //Программа вычисляет значение нижеприведенной функции от трех вещественных аргументов, передаваемых в массиве args
        //и выводит в консоль описание задачи и ответ в последней строке.
        
        double a;
        double b;
        double c;

        double requiredResult; // результат, который должен быть
        
        System.out.println("Значение функции z =((a-3)*b/2)+c");
        //Тест 1.
        a = 1;
        b = 2;
        c = 3;
        requiredResult = 1;
        //вывод значения функции
        System.out.println("Для аргументов \na= "+a+", b="+b+", c= "+c+"\nравно: "+functionZ(a, b, c)+" должно быть "+requiredResult);
        
      //Тест 2. Переполнение double
        a = Double.MAX_VALUE;
        b = 2;
        c = 3;
        requiredResult = Double.POSITIVE_INFINITY;
        //вывод значения функции
        System.out.println("Для аргументов \na= "+a+", b="+b+", c= "+c+"\nравно: "+functionZ(a, b, c)+" должно быть "+requiredResult);
    }
}