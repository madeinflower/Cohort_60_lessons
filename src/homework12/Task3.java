package homework12;

// Задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.

//Переменная 1 - сколько Вам полных лет
//Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
//Переменная 3 - Ваше имя.
//Используя форматированный вывод выведите в консоль строку вида:

//Привет! Меня зовут Сергей, мне 18 лет. Я покупаю молоко по 1.50 за литр.

public class Task3 {
    public static void main(String[] args) {
        int myAge = 37;
        double milkPricePerLiter = 1.56;
        String myName = "Tetiana";

        System.out.printf("Hi! My name is %s, and I'm %d years old. I buy milk for %.2f per liter.%n", myName, myAge, milkPricePerLiter);
    }
}

