package homework14;

import java.util.Scanner;

public class Task3 {
    // Попросите пользователя ввести целое число с клавиатуры.
    // Ваша программа должна вывести строку в формате:
    // Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
    // Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
    // Copy
    // Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isEven = (number % 2 == 0);
        boolean isMultipleOfThree = (number % 3 == 0);
        boolean isEvenAndMultipleOfThree = (isEven && isMultipleOfThree);

        System.out.println("Number: " + number +
                " even: " + isEven +
                "; multiple of 3: " + isMultipleOfThree +
                "; even and multiple of 3: " + isEvenAndMultipleOfThree);

        scanner.close();
    }
    }

