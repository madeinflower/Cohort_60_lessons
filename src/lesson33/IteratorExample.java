package lesson33;

// Есть два интерфейса: Iterable, Iterator
// Iterable - означает, что обьекты этого класса можно перебирать (итерироваться по ним)
// Один абстрактый метод Iterator<T> iterator() - возвращает итератор для этого набора элементов (коллекции)

// Iterator<T> - собственно итератор, который позволяет обходить коллекцию
// - boolean hasNext() - есть ли следующий элемент
// - T next() - возвращает следующий элемент
// - void remove() - удаляет последний возвращенный элемент (необязателен для переопределения)

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.addAll("Hello", "World", "Java", "Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String strCurrent = iterator.next();
            System.out.println(strCurrent);
            // iterator.remove(); - без переопределения мтеода выдает ошибку
        }

        // Цикл for-each


        // При переборе циклом for-each не рекомендуется изменять коллекцию
        /*
        for (ТипПеременной имяПеременной : коллекция) {
        // действие с переменной
        }
         */

        System.out.println("\n===================");

        // более удобный способ имплементировать то, что написано выше (строки 20-29)
        for (String strCurrent : list ) {
            System.out.println(strCurrent);
        }

        System.out.println("\n===================");

        // вывести в консоль все числа, которые есть в списке умноженные на 2
        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 2, 3, 4, 5, 6);

        // решение
        for (Integer value : integers) {
            System.out.println(value * 2);
        }

        System.out.println("\n===================");
        // вывести все элементы массива циклом for-each
        int[] array = {10, 20, 30, 40, 50};

        // решение
        for (int num : array) {
            System.out.println(num);
        }

    }
}
