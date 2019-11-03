//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.builder;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public interface BookBuilder {

    public BookBuilder isbn(String isbn);

    public BookBuilder title(String title);

    public BookBuilder price(double price);

    public Book build();
}
