package abstract_factory.divfactory;

public class DivLink extends abstract_factory.factory.Link {
    public DivLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<div class=\"link\"><a href=\"" + url + "\">" + caption + "</a></div>\n";
    }

}
