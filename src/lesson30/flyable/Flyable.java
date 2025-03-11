package lesson30.flyable;


public interface Flyable {
    void fly();
    default void methodA() {
        System.out.println("methodA");
    }

}
