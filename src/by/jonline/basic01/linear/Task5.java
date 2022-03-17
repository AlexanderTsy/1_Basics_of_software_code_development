package by.jonline.basic01.linear;

public class Task5 {

	// Задание 5. Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
	// Вывести данное значение длительности в часах, минутах и секундах в следующей форме:HHч MMмин SSс.
	
	// предположим что число передается в аргументах
	// часы до 10 будут выводиться двумя знаками, например 06ч
	public static void main(String[] args) {
		long timeInSeconds; //исходное число - длительность в секундах
		long hours; //число целых часов
		int minutesRemainder; // оставшиеся целые минуты, не более 59
		int secondsRemainder; // оставшиеся секунды, не более 59
		try {
			timeInSeconds = Long.parseLong(args[0]); // пробуем преобразовать входные данные во время в секундах
			hours = timeInSeconds / 3600; //целочисленное деление на 3600с=1ч
			minutesRemainder = (int) (timeInSeconds % 3600 )/ 60; //целочисленное деление на 60с=1мин остатка от деления на 3600 
			secondsRemainder = (int) (timeInSeconds - hours*3600 - minutesRemainder*60);
			//выводим результат в консоль, используя паттерн форматирования %02d - десятичное целое число, не меньше двух знаков
			//часы выводятся с группировкой по разрядам, испльзуется флаг "," %,02d
			System.out.println(String.format("%,02dч %02dмин %02dс",hours, minutesRemainder, secondsRemainder));
		} catch (NumberFormatException nfException) {
			//сообщаем в консоль об ошибке 
			System.err.println("Ошибка входных данных. \""+args[0]+"\" не является натуральным числом");
		}

	}

}
