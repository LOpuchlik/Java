package Obiekty_i_klasy.hermetyzacja;

import java.time.LocalDate;

public class Person {
    private String name;
    private String surname;
    //private int year;
    //private int month;
    //private int day;
    private int age;

    public Person(String name, String surname, int yearOfBirth, int monthOfBirth, int dayOfBirth){
        this.name = name;
        this.surname = surname;
        this.age = (LocalDate.now()).getYear()-(LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth).getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person: " + name + " " + surname + ", age: " +  age;
    }
}
