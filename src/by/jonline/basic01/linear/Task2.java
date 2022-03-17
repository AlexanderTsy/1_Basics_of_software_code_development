package by.jonline.basic01.linear;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task2 {
    public static void main(String[] args) {
        //программа вычисляет значение выражения, приведенного ниже, переменные задаются в теле программы
        //используются методы sqrt(a) - квадратный корень и pow(a,b) - возведение числа в степень из пакета java.lang.Math
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //(b+sqrt(b^2+4ac))/2a-a^3c+b^-2
        double a;
        double b;
        double c;
        double result; //результат
        //инициализация переменных
        a= 8.0;
        b= 7.12;
        c=12;

        result = (b+ sqrt(pow(b,2)+4*a*c))/(2*a)
                -pow(a,3)*c
                +pow(b,-2);
        //вывод результата в консоль
        System.out.println(result);
    }
}