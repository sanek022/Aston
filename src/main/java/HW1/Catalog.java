package HW1;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books = new ArrayList<>();
    public Catalog()
        {
            books.add(new Book("Robert Louis Stevenson", "Treasure Island"));
            books.add(new Book("Mario Puzo", "The Godfather"));
            books.add(new Book("J. K. Rowling", "Harry Potter"));
        }

    public boolean checkBook(String author, String title) {
        for (Book book : books) {
            if(book.getAuthor().equals(author) && book.getTitle().equals(title)){
                books.remove(book);
                return true;
            }
        }
        return false;
    }
}
