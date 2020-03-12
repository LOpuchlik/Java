package Obiekty_i_klasy.statyczne;


public class Rounding {
    public static void main(String[] args) {
        final double PI = Math.PI;
        System.out.println(PI);
        System.out.println(Math.round(PI*1000000d)/1000000d);
        System.out.println(Math.round(PI*10000d)/10000d);
    }
}
