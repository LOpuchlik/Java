package Obiekty_i_klasy.statyczne;

import java.text.NumberFormat;
import java.time.LocalDate;

public class Rounding {
    public static void main(String[] args) {
        final double PI = Math.PI;
        System.out.println(PI);
        System.out.println(Math.round(PI*1000000d)/1000000d);
        System.out.println(Math.round(PI*10000d)/10000d);

        double x = 2;
        double res = Math.pow(x, 10); // metoda statyczna - nie jest potrzebny zaden obiekt klasy Math
        System.out.println("2^10 is equal to: " + (int)(res));


        // tworzenie obiektów przy pomcy metod fabrycznych
        LocalDate today = LocalDate.now();
        System.out.println(today);

        double value = 0.12;

        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(value));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(value));

    }
}
