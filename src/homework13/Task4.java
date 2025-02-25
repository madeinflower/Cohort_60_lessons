package homework13;

public class Task4 {
    // Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.
    // Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.
    // Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции
    // (без использования библиотечных функций), и выведите результат.

        public static void main(String[] args) {
            // Define name using separate char variables
            char ch1 = 'h';
            char ch2 = 'a';
            char ch3 = 'n';
            char ch4 = 'n';
            char ch5 = 'a';

            String name = "" + ch1 + ch2 + ch3 + ch4 + ch5;

            String upperCaseName = name.toUpperCase();

            System.out.println(upperCaseName);
        }
    }
