package software.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String Name;
    private final LocalDate Birthday;

    public Person(String name, LocalDate birthday) {
        Name = name;
        Birthday = birthday;
    }

    public int getYears(){
        Period period = Period.between(LocalDate.now(), Birthday);
        return period.getYears();
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Birthday=" + Birthday +
                ", Years=" + getYears() +
                '}';
    }
}
