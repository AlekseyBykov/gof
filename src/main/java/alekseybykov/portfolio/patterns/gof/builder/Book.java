//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.builder;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
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
