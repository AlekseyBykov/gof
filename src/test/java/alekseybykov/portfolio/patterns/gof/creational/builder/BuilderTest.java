package alekseybykov.portfolio.patterns.gof.creational.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests for Builder Pattern")
class BuilderTest {

    @Test
    @DisplayName("Create object step by step using builder pattern")
    void testCreateObjectStepByStep() {

        final String isbn = "123";
        final String title = "Title";
        final double price = 100.09;

        Book book = new SimpleBookBuilder()
                .isbn(isbn)
                .title(title)
                .price(price)
                .build();

        assertEquals(isbn, book.getIsbn());
        assertEquals(title, book.getTitle());
        assertEquals(price, book.getPrice());
    }
}
