//
// Feel free to use these solutions in your work.
//
package alekseybykov.portfolio.patterns.gof.composite;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author  aleksey.n.bykov@gmail.com
 * @version 2019-11-03
 */
public class XmlElement implements Comparable<XmlElement> {

    private String name;
    private int level;

    private Set<XmlElement> elements = new LinkedHashSet<>();

    public XmlElement(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void addElement(XmlElement xmlElement) {
        elements.add(xmlElement);
    }

    @Override
    public int compareTo(XmlElement element) {
        if (this.level > element.level) {
            return 1;
        } else if (this.level < element.level) {
            return -1;
        }
        return 0;
    }

    public Set<XmlElement> getElements() {
        return elements;
    }
}
