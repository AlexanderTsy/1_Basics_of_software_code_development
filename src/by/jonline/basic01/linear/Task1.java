package by.jonline.basic01.linear;

public class Task1 {
    public static void main(String[] args) {
        //Программа вычисляет значение нижеприведенной функции от трех вещественных аргументов, передаваемых в массиве args
        //и выводит в консоль описание задачи и ответ в последней строке.
        // Найдите значение функции: z =((a-3)*b/2)+c
        double a;
        double b;
        double c;

        double z; // результат
        // инициализация переменных
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        //вычисление значения
        z =((a-3)*b/2)+c;
        //вывод значения функции
        System.out.println("Значение функции z =((a-3)*b/2)+c для аргументов \na= "+a+", b="+b+", c= "+c+"\nравно: \n"+z);
    }
}