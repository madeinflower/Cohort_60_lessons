package lesson33.persons;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    /*
    test@gmail.com
    1. Должна присутствовать @ и только одна
    2. После собаки должна біть точка
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, спецсимволы _ + - @
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */

    private boolean isEmailValid(String email) {
        // Должна присутствовать @ и только одна
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;

        // Проверяем, что есть точка после @
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // После последней точки есть 2 или более символов
        if (email.length() - dotIndexAfterAt <= 2) return false;

        // Алфавит, цифры, спецсимволы _ . - @

        /*
        Перебираю все символы в строке. Проверяю текущий символ.
        Если нахожу хоть один неправильній сразу возвращаю false
        */

        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()) {

            // проверка символа на правильность
            boolean isPass = //Character.isAlphabetic(ch)
                    (ch >= 'a' && ch <= 'z')
                    || (ch >= 'A' && ch <= 'Z')
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            // Если символ не подходит (isPass == false), возвращаем false

            if (!isPass) {
                return false;
            }

        }

        // if (!email.matches("[a-zA-Z0-9_+\\-@.]+")) return false;

        // До собаки должен быть хотя бы один символ. То есть индекс собаки НЕ равен 0
        if (indexAt == 0) return false;

        // Первый символ (символ с индексом 0) - должна быть буква
        if (!Character.isLetter(email.charAt(0))) return false;

        // все проверки пройдены, имеил подходит
        return true;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
