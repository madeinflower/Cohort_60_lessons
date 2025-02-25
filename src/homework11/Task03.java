package homework11;

public class Task03 {
    public static void main(String[] args) {
        int firstVariable = 0;
        int secondVariable = 1;
        int thirdVariable = 2;
        int fourthVariable = 3;

        int sum = firstVariable + secondVariable + thirdVariable + fourthVariable;
        int average = sum / 4;
        int remainder = sum % 4;

        System.out.println("Integer average: " + average);
        System.out.println("Discarded remainder: " + remainder);
    }
}
