package alekseybykov.portfolio.patterns.gof.creational.builder;

/**
 * Examples from JDK:
 *
 * {@link java.lang.StringBuilder#append(Object)
 *  @link java.lang.StringBuffer#append(Object)
 * }
 *
 * @author Aleksey Bykov
 * @since 03.11.2019
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
