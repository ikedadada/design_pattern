package abstract_factory.listfactory;

public class ListLink extends abstract_factory.factory.Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }

}
