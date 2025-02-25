package lesson12;

/**
 * @author Sergey Bugaenko
 * {@code @date} 12.02.2025
 */

public class TypeCasting {
    public static void main(String[] args) {

        /*
        Два способа преобразования типа данных
        1. Неявное преобразование (автоматическое)
        2. Явное преобразование (кастинг)
         */

        // Неявное преобразование происходит автоматически, когда значение меньшего типа данных
        // преобразуется в бОльший тип данных
        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // Неявное преобразование типа byte в тип int
        System.out.println("intVal: " + intVal);

        double doubleVal = intVal; // Неявно преобразование int в double
        System.out.println("doubleVal: " + doubleVal);

        // Явное преобразование
        // Требуется, когда нужно преобразовать значения из бОльшего типа данных
        // в значение меньшего типа данных, так как
        // это может привести к потере данных

        double doubleVal2 = 42.9;
        int int1 = (int) doubleVal2; // Явное преобразование из double в int

        System.out.println("doubleVal2: " + doubleVal2);
        System.out.println("int1: " + int1);

        short shortVal = (short) int1; // Явное преобразование к типу данных short
        System.out.println("shortVal: " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00; // Тип данных double вмещает гораздо больший диапазон значений
        // (в том числе и в целой части)

        System.out.println("\n ======================= \n");

        // Преобразование в вычислениях

        int x = 20;
        int y = 7;

        double result;

        // 20 / 7 -> 2 (int) -> неявное автоматическое преобразование 2 -> 2.0 -> result
        result = x / y;
        System.out.println("result: " + result);


        // 20 / 7.0 -> 20.0 / 7.0 -> 2.857... -> result
        result = x / 7.0;
        System.out.println("doubl result: " + result);

        /*
            Когда в выражение (в формуле) присутствует несколько типов данных,
            то все меньшие типы данных автоматически, неявно, приводятся к более широкому типу
         */

        /*
        (float) 20 / 7 -> 20.0f / 7 -> 20.0f / 7.0f -> 2.85f -> авто 2.85d -> result
        1. int x - явно преобразуется во float
        2. int y -> неявно преобразуется во float
        3. Производится деление 20.0f / 7.0f -> 2.85f
        4. 2.85f -> неявно (авто) преобразуется в тип данных double
         */

        result = (float) x / y;
        System.out.println("float result: " + result);

        result = x / (double) y;
        System.out.println("doubl result: " + result);

        // Приоритет математических операций

        int varC = 2 + 8 / 2;
        System.out.println("varC: " + varC);
        /*
        Приоритет - как в математике. Если приоритет равный - операции выполняются слева направо

        1. () - Сначала выполняется операция в скобках
        2. '* / %' - Умножение, деление, остаток от деления
        3. '+ -' - Сложение и вычитание
         */

//        5 / 2  -> 2 целых + 5 - (2 * 2) = 1
//        2 / 5 -> 0 + 2 - (0 * 5) = 2

//        2 / 5 -> 0 целых + 2 в остатке

        varC = (2 + 8) / 2;
        System.out.println("varC: " + varC);
        // 12 % 5 = 2 + 2 оста
        varC = 25 / (2 % 5) * 3;
        System.out.println("25 / (2 % 5) * 3 = " + varC);
        varC = 25 / 2 % 5 * 3;
        System.out.println("25 / 2 % 5 * 3 = " + varC);

    }
}
