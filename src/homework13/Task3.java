package homework13;

import java.util.Scanner;

public class Task3 {
    // Попросите пользователя ввести строку чётной длины с клавиатуры.
    // Распечатайте два средних символа строки.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text;

            while (true) {
                System.out.print("Enter a string with an even length: ");
                text = scanner.nextLine();

                if (text.length() % 2 == 0) {
                    break;
                } else {
                    System.out.println("Error! Please enter a string with an even length.");
                }
            }

            int middleIndex = text.length() / 2;
            String middleChars = text.substring(middleIndex - 1, middleIndex + 1);

            System.out.println("The two middle characters: " + middleChars);
        }
    }

