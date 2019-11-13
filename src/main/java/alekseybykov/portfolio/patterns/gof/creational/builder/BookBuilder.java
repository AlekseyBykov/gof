package alekseybykov.portfolio.patterns.gof.creational.builder;

public interface BookBuilder {

    public BookBuilder isbn(String isbn);

    public BookBuilder title(String title);

    public BookBuilder price(double price);

    public Book build();
}
