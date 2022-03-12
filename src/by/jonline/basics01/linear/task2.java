package by.jonline.basics01.linear;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class task2 {
    public static void main(String[] args) {
        //Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //(b+sqrt(b^2+4ac))/2a-a^3c+b^-2
        double a;
        double b;
        double c;
        double result; //результат

        a= 8.0;
        b= 7.12;
        c=12;

        result = (b+ sqrt(pow(b,2)+4*a*c))/(2*a)
                -pow(a,3)*c
                +pow(b,-2);

        System.out.println(result);
    }
}
