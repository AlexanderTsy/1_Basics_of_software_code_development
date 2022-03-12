package by.jonline.basics01.linear;

public class task1 {
    public static void main(String[] args) {
        // Найдите значение функции: z =((a-3)*b/2)+c
        double a;
        double b;
        double c;

        double z; // результат

        a = 7.5;
        b = -43.37;
        c = 8.123;

        z =((a-3)*b/2)+c;
        System.out.println("Значение функции z =((a-3)*b/2)+c для аргументов \na= "+a+", b="+b+", c= "+c+"\nравно: "+z);
    }
}
