package alekseybykov.portfolio.patterns.gof.structural.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
@DisplayName("Tests for Composite Pattern")
class CompositeTest {

    @Test
    @DisplayName("Create hierarchy and traversing it")
    void testCreateAndTraverseHierarchy() {

        XmlElement root = new XmlElement("book");

        XmlElement isbn = new XmlElement("isbn");
        XmlElement author = new XmlElement("author");
        XmlElement price = new XmlElement("author");

        XmlElement firstName = new XmlElement("firstName");
        XmlElement lastName = new XmlElement("lastName");
        XmlElement middleName = new XmlElement("middleName");

        root.addElement(isbn);
        root.addElement(author);
        root.addElement(price);

        author.addElement(firstName);
        author.addElement(lastName);
        author.addElement(middleName);

        Set<XmlElement> rootElements = root.getElements();
        Iterator<XmlElement> rootIterator = rootElements.iterator();

        assertEquals(isbn, rootIterator.next());
        assertEquals(author, rootIterator.next());
        assertEquals(price, rootIterator.next());

        Set<XmlElement> authorElements = author.getElements();
        Iterator<XmlElement> authorIterator = authorElements.iterator();

        assertEquals(firstName, authorIterator.next());
        assertEquals(lastName, authorIterator.next());
        assertEquals(middleName, authorIterator.next());
    }
}
