package homework15;

import java.util.Scanner;

public class Task2 {
    // Напишите программу с использованием оператора switch:
    // Программа просит пользователя ввести число от 1 до 7.
    // Если число равно 1, выводим на консоль "Monday", 2 — "Tuesday" и так далее. Если 6 или 7 — "Day off".

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number from 1 to 7 incl.: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6, 7 -> System.out.println("Day off");
            default -> System.out.println("Error: enter any number from 1 to 7 incl.");
        }
        scanner.close();
    }
}
