import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Matthew", 25));
        people.add(new Person("Matte", 33));
        people.add(new Person("Z", 10));
        people.add(new Person("Azul", 76));
        people.add(new Person("Name", 27));
        people.add(new Person("Another", 45));
        people.add(new Person("Matthew", 26));

        Collections.sort(people, Comparator.comparing(Person::getName).
            thenComparing(Person::getAge).reversed());
       

        for(Person p : people) {
            System.out.println(p.getName() + "-" + p.getAge());
        }
    }
}