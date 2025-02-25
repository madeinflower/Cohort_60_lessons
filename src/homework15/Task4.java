package homework15;

import java.util.Random;

public class Task4 {
    // Используйте оператор switch для решения задачи:
    //Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.
    //Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.
    //Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
    //Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
    //Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
    //Оценка 3 балла: огорчитесь и вычтите 30 минут.
    //Оценка меньше 3 баллов: запретите телевизор на сегодня.
    //Выведите на экран оставшееся время для просмотра ТВ.
    //P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.

    public static void main(String[] args) {

        Random random = new Random();
        int grade = random.nextInt(13);
        int remainingTime = 45;

        System.out.println("Test score: " + grade);

        switch (grade) {
            case 10, 11, 12 -> {
                System.out.println("Excellent work! You are amazing!");
                remainingTime += 60;
            }
            case 7, 8, 9 -> {
                System.out.println("Well done! Good job!");
                remainingTime += 45;
            }
            case 4, 5, 6 -> {
                System.out.println("Not bad, but you can do better.");
                remainingTime += 15;
            }
            case 3 -> {
                System.out.println("I'm disappointed. You need to improve your math.");
                remainingTime -= 30;
            }
            default -> {
                System.out.println("Very bad! No TV for today!");
                remainingTime = 0;
            }
        }

        remainingTime = Math.min(remainingTime, 60);
        System.out.println("Remaining TV time: " + remainingTime + " minutes.");
    }

}
