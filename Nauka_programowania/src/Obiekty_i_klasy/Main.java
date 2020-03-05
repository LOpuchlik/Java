package Obiekty_i_klasy;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // LocalDate ma prywatny dostęp, a więc stworzenie obiektu z użyciem new jest niemożliwe
        LocalDate date = LocalDate.of(2020,3,5);
        System.out.println(date.toString());

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year + " month: " + month + " day: " + day);

        LocalDate oneYearLater = date.plusDays(365);
        System.out.println("One year later: " + oneYearLater);


        System.out.println("=================================================================");

        String sentence = "To jest jakieś zdanie!";
        System.out.println("Sentence: " + sentence);
        System.out.println("Uppercase sentence: " + sentence.toUpperCase());
        System.out.println("Sentence: " + sentence); // metoda toUppercase nie zmienia pierwotnego Stringa - Stringi są immutable

        System.out.println("=================================================================");





    }
}
