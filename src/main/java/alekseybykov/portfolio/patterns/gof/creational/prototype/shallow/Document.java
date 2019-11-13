package alekseybykov.portfolio.patterns.gof.creational.prototype.shallow;

public abstract class Document implements Cloneable {

    private String content;
    private Long id;

    public Document clone() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
