package homework13;

public class Task2AndTask2_2 {
    public static void main(String[] args) {
        // Создайте строки:
        //"Java"
        //"is"
        //"a"
        //"powerful"
        //"language"
        //Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
        //Выведите на экран получившуюся строку и её длину.

        String java = "Java";
        String is = " is";
        String a = " a";
        String powerful = " powerful";
        String language = " language";

        String concatStrings1 = java + is + a + powerful + language;
        System.out.println(concatStrings1);
        System.out.println("The length of the sentence above is " + concatStrings1.length() + " symbols");

        String concatStrings2 = java.concat(is).concat(a).concat(powerful).concat(language);
        System.out.println(concatStrings2);
        System.out.println("Length: " + concatStrings2.length());

        // Замените в результирующей строке слово "powerful" на "super".
        //Опционально Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        //Выведите на экран значение этой переменной.

        String replacedString = concatStrings2.replace("powerful", "super");
        System.out.println("Modified string: " + replacedString);

        boolean containsAge = replacedString.contains("age");
        System.out.println("Does the string contain 'age'? " + containsAge);
    }
}
