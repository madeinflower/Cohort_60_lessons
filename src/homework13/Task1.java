package homework13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
        //Используя Scanner, сохраните имя в переменную типа String.
        //Выведите на экран количество символов в имени пользователя.
        //Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
        //Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("The length of your entered name is " + name.length() + " symbols.");

        char firstSymbol = name.charAt(0);
        char lastSymbol = name.charAt(name.length() - 1);
        System.out.println("First symbol: " + firstSymbol + ", it's code is: " + (int) firstSymbol);
        System.out.println("Last symbol: " + lastSymbol + ", it's code is: " + (int) lastSymbol);
    }
}
