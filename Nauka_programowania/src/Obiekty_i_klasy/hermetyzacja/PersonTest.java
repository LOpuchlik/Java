package Obiekty_i_klasy.hermetyzacja;

public class PersonTest {

    public static void main(String[] args) {
        Person person = new Person("Rachel", "Murillo", 1975);
        System.out.println(person.toString());

        // person.name = "Elena";  //nie dziala z powodu hermetyzacji
        person.setName("Itziar");
        System.out.println(person.toString());  // poprzez setter można zmienić wartość prywatnego pola

        // System.out.println(person.name); //nie dziala z powodu hermetyzacji - brak bezpośredniego dostępu
        System.out.println(person.getName()); // poprzez getter można odczytać wartość prywatnego pola
    }
}
