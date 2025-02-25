package homework15;

import java.util.Random;

public class Task1 {
    // Запишите в 4 переменные случайные числа от 0 до 100.
    // Выведите все 4 числа на экран.
    // Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
    // Output:
    // Максимальное число: 33

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int c = random.nextInt(101);
        int d = random.nextInt(101);

        int max = Math.max(Math.max(a, b), Math.max(c, d));

        System.out.println("Number a is: " + a);
        System.out.println("Number b is: " + b);
        System.out.println("Number c is: " + c);
        System.out.println("Number d is: " + d);
        System.out.println(" ");
        System.out.println("Max number is: " + max);
    }

}


