package homework12;

public class Task2 {
    public static void main(String[] args) {
        double day1 = 1.0;
        double day2 = 1.9;
        double day3 = 2.0;
        double day4 = -1.2;
        double day5 = -1.1;
        double day6 = 0.2;
        double day7 = -0.3;

        double averageTemperature = (day1 + day2 + day3 + day4 + day5 + day6 + day7) / 7;
        System.out.printf("Average week temperature: %.2f°C%n", averageTemperature);
    }
}
