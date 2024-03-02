package abstract_factory.divfactory;

public class DivTray extends abstract_factory.factory.Tray {
    public DivTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<div>\n");
        buffer.append("<h3>" + caption + "</h3>\n");
        buffer.append("<div class=\"tray\">\n");
        for (abstract_factory.factory.Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</div>\n");
        buffer.append("</div>\n");
        return buffer.toString();
    }

}
