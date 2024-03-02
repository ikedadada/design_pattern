package abstract_factory.divfactory;

public class DivPage extends abstract_factory.factory.Page {
    public DivPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<!DOCTYPE html>\n");
        buffer.append("<html><head><title>" + title + "</title>\n");
        buffer.append("<style>\n");
        buffer.append("div.tray {padding: 0.5em; margin-left: 5em; border: 1px solid black; }\n");
        buffer.append("div.link {padding: 0.5em; background-color: lightgray; }\n");
        buffer.append("</style></head><body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<div>\n");
        for (abstract_factory.factory.Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</div>\n");
        buffer.append("<hr><address>");
        buffer.append(author);
        buffer.append("</address>");
        buffer.append("</body></html>");
        return buffer.toString();

    }

}
