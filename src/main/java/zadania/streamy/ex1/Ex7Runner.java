package zadania.streamy.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex7Runner {
    public static void main(String[] args) {

    }

    static void ex1(){
        personList().stream();
                //.filter(person -> person.)
                //.sorted()
                //.allMatch()
    }

    static void ex2(){

    }

    static void ex3(){

    }

    static List<Person> personList(){
        return Arrays.asList(
                new Person("Jan", "Nowak", 18, 1.60f, null),
                new Person("Jan", "Kowalski", 18, 1.60f, null),
                new Person("Ceslawa", "Testowa", 25, 1.80f, null),
                new Person("Pioter", "Nosacz", 13, 1.40f, null),
                new Person("Wojciech", "Mann", 28, 1.50f, null),
                new Person("Krzysztof", "Ibisz", 65, 1.60f, null),
                new Person("Krzysztof", "Krawczyk", 90, 1.70f, null),
                new Person("Jan", "Nowak", 13, 1.30f, null)
        );
    }

}

class Person {
    private String name;
    private String surname;
    private int age;
    private float height;
    private String comment;

    public Person(String name, String surname, int age, float height, String comment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getComment() {
        return comment;
    }
}
