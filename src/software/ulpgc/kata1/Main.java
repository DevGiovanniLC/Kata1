package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Giovanni", LocalDate.of(2001, 5, 30));
        System.out.println(person1);
    }
}
