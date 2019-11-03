//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
@DisplayName("Tests for Composite Pattern")
class CompositeTest {

    @Test
    @DisplayName("Create hierarchy and traversing it")
    void testCreateAndTraverseHierarchy() {

        XmlElement root = new XmlElement("book", 0);

        XmlElement isbn = new XmlElement("isbn", 1);
        XmlElement author = new XmlElement("author", 1);
        XmlElement price = new XmlElement("author", 1);

        XmlElement firstName = new XmlElement("firstName", 2);
        XmlElement lastName = new XmlElement("lastName", 2);
        XmlElement middleName = new XmlElement("middleName", 2);

        author.addElement(firstName);
        author.addElement(lastName);
        author.addElement(middleName);

        root.addElement(isbn);
        root.addElement(author);
        root.addElement(price);

        Set<XmlElement> xmlDocument = new TreeSet<>();
        xmlDocument.add(root);

        Iterator<XmlElement> xmlIterator = xmlDocument.iterator();

        assertEquals(root, xmlIterator.next());

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
