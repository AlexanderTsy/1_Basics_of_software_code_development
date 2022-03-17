package by.jonline.basic01.loop;

public class Task6 {
	/* Циклы. Задание 6
	 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
	 */
	
	/*
	 * в Java тип char отображает символы в кодировке utf-8
	 * размер типа 2 байта, может принимать 65536 значений
	 * для целей задачи выведем соответствие символов их значениям между начальным и конечным номером
	 * например символы русского алфавита
	 */
	public static void main(String[] args) {
		int startNum=0x0410; //начальный номер
		int endNum=0x044F; //конечный номер
		int number=startNum; // переменная с текущим номером
		
		do {
			System.out.println("'"+(char)number+"' - "+number);
			number++;
		} while (number<=endNum);
		// еще немного интересных букв
		System.out.println("'"+(char)0x0406+"' - "+number);
		System.out.println("'"+(char)0x0456+"' - "+number);
		System.out.println("'"+(char)0x040E+"' - "+number);
		System.out.println("'"+(char)0x045E+"' - "+number);
	}

}
