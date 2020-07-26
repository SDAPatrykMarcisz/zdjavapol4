package zadania.streamy.ex1;

import java.util.Collections;
import java.util.List;

public class Ex7Runner {
    public static void main(String[] args) {

    }

    static void ex1(){

    }

    static void ex2(){

    }

    static void ex3(){

    }

    static List<Person> personList(){
        return Collections.emptyList();
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
