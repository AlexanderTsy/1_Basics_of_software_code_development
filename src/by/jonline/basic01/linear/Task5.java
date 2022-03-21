package by.jonline.basic01.linear;
/*
 * 1. Basics of software code development
 * Линейные программы Задание 5
 * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:HHч MMмин SSс.
 */

public class Task5 {
	
	public static String formatTimeHHMMSS(final long timeInSeconds) {
		long hours; //число целых часов
		int minutesRemainder; // оставшиеся целые минуты, не более 59
		int secondsRemainder; // оставшиеся секунды, не более 59
		
		if ( timeInSeconds < 0 ) {
			System.err.println("Время должно быть больше 0");
			return null;
		}
		
		hours = timeInSeconds / 3600; //целочисленное деление на 3600с=1ч
		minutesRemainder = (int) (timeInSeconds % 3600 )/ 60; //целочисленное деление на 60с=1мин остатка от деления на 3600 
		secondsRemainder = (int) (timeInSeconds - hours*3600 - minutesRemainder*60);
		
		//сформируем результат, используя паттерн форматирования %02d - десятичное целое число, не меньше двух знаков
		//часы выводятся с группировкой по разрядам, испльзуется флаг "," %,02d
		return String.format("%,02dч %02dмин %02dс",hours, minutesRemainder, secondsRemainder);
		
	}
	
	public static void main(String[] args) {
		long timeInSeconds; //исходное число - длительность в секундах
		
		timeInSeconds = -500;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
		
		timeInSeconds = 0;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
		
		timeInSeconds = 86400;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
		
		timeInSeconds = 6586400;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
		
		timeInSeconds = 3600;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
		
		timeInSeconds = 500;
		System.out.println(timeInSeconds + "с - " + formatTimeHHMMSS(timeInSeconds));
	}

}
