package homework14;

public class Task1 {
    // Дан текст Programming is fun.
    // Напишите программу, которая проверяет, содержит ли эта строка слово “fun”, и выведите результат в виде булевой переменной.

    public static void main(String[] args) {
        String text = "Programming is fun.";
        boolean containsFun = text.contains("fun");
        System.out.println(containsFun);
    }

}
