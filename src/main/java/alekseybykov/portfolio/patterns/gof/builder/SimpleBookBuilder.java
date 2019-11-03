//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.builder;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class SimpleBookBuilder implements BookBuilder {

    private Book book = new Book();

    @Override
    public BookBuilder isbn(String isbn) {
        book.setIsbn(isbn);
        return this;
    }

    @Override
    public BookBuilder title(String title) {
        book.setTitle(title);
        return this;
    }

    @Override
    public BookBuilder price(double price) {
        book.setPrice(price);
        return this;
    }

    @Override
    public Book build() {
        return book;
    }
}
