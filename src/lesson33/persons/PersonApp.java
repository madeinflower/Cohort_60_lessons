package lesson33.persons;

public class PersonApp {
    public static void main(String[] args) {
        Person validEmailPerson = new Person("test@gmail.com", "password");
        Person person1 = new Person("test@@gmail.com", "password");
        Person person2 = new Person("test@gmailcom", "password");
        Person person3 = new Person("test@gmail.", "password");
        Person person4 = new Person("кириллица@gmail.com", "password");
        Person person5 = new Person("@gmail.com", "password");
        Person person6 = new Person("1@gmail.com", "password");

        System.out.println(validEmailPerson);
        System.out.println(" ");
        System.out.println(person1);
        System.out.println(" ");
        System.out.println(person2);
        System.out.println(" ");
        System.out.println(person3);
        System.out.println(" ");
        System.out.println(person4);
        System.out.println(" ");
        System.out.println(person5);
        System.out.println(" ");
        System.out.println(person6);

    }
}
