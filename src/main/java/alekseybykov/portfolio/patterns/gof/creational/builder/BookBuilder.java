package alekseybykov.portfolio.patterns.gof.creational.builder;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
public interface BookBuilder {

    public BookBuilder isbn(String isbn);

    public BookBuilder title(String title);

    public BookBuilder price(double price);

    public Book build();
}
