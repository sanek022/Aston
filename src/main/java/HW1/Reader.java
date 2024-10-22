package HW1;

public class Reader {
    private Order order;

    public void makeOrder(String author, String title, String readingPlace){
        order = new Order(author, title, readingPlace);
    }
    public Order getOrder(){
        return order;
    }
}
