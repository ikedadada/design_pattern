package abstract_factory.listfactory;

import abstract_factory.factory.Item;

public class ListPage extends abstract_factory.factory.Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<!DOCTYPE html>\n");
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        for (Item item : content) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>");
        buffer.append(author);
        buffer.append("</address>");
        buffer.append("</body></html>");
        return buffer.toString();
    }

}
