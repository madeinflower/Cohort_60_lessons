package homework14;

import java.util.Random;

public class Task2 {
    // Создайте две переменные типа int.
    //В первую переменную запишите случайное значение от 0 до 50.
    //Во вторую переменную случайное значение от 0 до 100.
    //(опционально) Во вторую переменную случайное значение от -20 до 30.
    //Проверьте:
    //равны ли переменные,
    //не равны ли они,
    //больше ли a, чем b,
    //и меньше ли b, чем a.
    //Выведите результат на экран.
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(51);
        int b = random.nextInt(101);

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isAGreater = (a > b);
        boolean isBLess = (b < a);

        System.out.println("Число a: " + a);
        System.out.println("Число b: " + b);
        System.out.println("a == b: " + isEqual);
        System.out.println("a != b: " + isNotEqual);
        System.out.println("a > b: " + isAGreater);
        System.out.println("b < a: " + isBLess);
    }
    }

