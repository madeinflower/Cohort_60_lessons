package lesson12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.02.2025
 */

public class PrintFormat {

    public static void main(String[] args) {

        double result = 20.0 / 7;
        int age = 25;
        String name = "Alice";

        System.out.println("Name: " + name + ", Age: " + age + ", score: " + result);
        // "Шаблон {varName} строки" -- Python
        System.out.println("Hello");

        // printf() - форматированный вывод
        System.out.printf("Name: %s, Age: %d, score: %.3f\n", name, 18, result);
        System.out.println("World");
        System.out.println("Second line");

        /*
        Место, куда я хочу вставить значение переменной всегда помечается значком %
        После % я должен указать тип данных
        %d - целое число (digit)
        %f - число с плавающей точкой (float)
        %.3f - указать формат вывода числа - кол-во знаков после запятой
        %s - текст (string - строка)
        \n - работает в любой строке - добавляет перевод каретки на новую строку
        %n - символ новой строки (работает только в printf)
         */

        // sout - println
        // souf - printf



    }


}
