package HW1;

public class Order {
    private String title;
    private String author;
    private String readingPlace;
    public Order(String author, String title,  String readingPlace) {
        this.title = title;
        this.author = author;
        this.readingPlace = readingPlace;
    }

    public String getAuthor() {
        return author;
    }

    public String getReadingPlace() {
        return readingPlace;
    }

    public String getTitle() {
        return title;
    }
}
