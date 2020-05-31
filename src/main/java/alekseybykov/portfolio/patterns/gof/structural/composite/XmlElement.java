package alekseybykov.portfolio.patterns.gof.structural.composite;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author Aleksey Bykov
 * @since 03.11.2019
 */
public class XmlElement {

    private String name;

    private Set<XmlElement> elements = new LinkedHashSet<>();

    public XmlElement(String name) {
        this.name = name;
    }

    public void addElement(XmlElement xmlElement) {
        elements.add(xmlElement);
    }

    public Set<XmlElement> getElements() {
        return elements;
    }
}
