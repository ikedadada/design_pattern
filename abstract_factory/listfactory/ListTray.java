package abstract_factory.listfactory;

public class ListTray extends abstract_factory.factory.Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("\n<ul>\n");
        for (abstract_factory.factory.Item item : tray) {
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

}
