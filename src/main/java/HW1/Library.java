package HW1;

import java.util.List;

public class Library {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Reader reader = new Reader();
        reader.makeOrder("Mario Puzo", "The Godfather", "Reading hall");
        librarian.listenToOrder(reader);
        System.out.println(librarian.giveBook());
    }
}
