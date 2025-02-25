package lesson12;

public class IncrementExample {
    public static void main(String[] args) {

        int x = 5;
        x = x + 10;

        x += 5; //x = x + 5;
        System.out.println("x: " + x);
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2;
        x /= 5;
        System.out.println("19 строка -> x = " + x);

        x++; // x = x + 1; x += 1; // Инкремент - увеличить текущее значение в переменной x на 1

        System.out.println("x: " + x);

        x--; // x + x -1; // x -= 1; // Декремент - уменьшить текущее значение в переменной x на 1
        System.out.println("x: " + x);


        /*
            Инкремент и декремент можно записать по-разному:
             после переменной x++, x-- (постфикс)
             перед переменной ++x, --x (префикс)

             Если запись постфикс (x++), то сначала используется текущее значение переменной, а потом оно будет увеличено
         */

        int var = 100;
        System.out.println("var: " + var++);
        System.out.println("var: " + var);

        int y = 100;
        System.out.println("y: " + ++y);
        System.out.println("y: " + y);





    }
}
