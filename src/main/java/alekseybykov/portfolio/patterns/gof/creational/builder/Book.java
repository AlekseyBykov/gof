package alekseybykov.portfolio.patterns.gof.creational.builder;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
public class Book {
    private String isbn;
    private String title;
    private double price;

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
