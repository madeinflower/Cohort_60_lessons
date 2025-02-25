package homework11;

public class Task03_add1 {
    public static void main(String[] args) {
        double productAPrice = 1000.0;
        double productBPrice = 500.0;

        double totalPrice = productAPrice + productBPrice;

        double discountRate = 0.10;

        double discountAmount = totalPrice * discountRate;

        double finalPrice = totalPrice - discountAmount;

        System.out.println("Final price (with discount): " + finalPrice + " Euro");
        System.out.println("Discount amount: " + discountAmount + " Euro");
    }
}
