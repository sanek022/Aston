package HW1;

public class Librarian {
    private Reader reader;
    private Catalog catalog = new Catalog();;
    public Librarian() {

    }
    public void listenToOrder(Reader reader){
        this.reader = reader;
    }
    public String giveBook() {
        if(catalog.checkBook(reader.getOrder().getAuthor(), reader.getOrder().getTitle())){
        return "Librarian give a book " + reader.getOrder().getAuthor() + "  " + reader.getOrder().getTitle()
                + " for reading in " + reader.getOrder().getReadingPlace();
        }
        else{ return  "We don't have this book";}
    }
}
