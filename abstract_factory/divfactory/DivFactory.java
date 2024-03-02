package abstract_factory.divfactory;

public class DivFactory extends abstract_factory.factory.Factory {
    @Override
    public abstract_factory.factory.Link createLink(String caption, String url) {
        return new DivLink(caption, url);
    }

    @Override
    public abstract_factory.factory.Tray createTray(String caption) {
        return new DivTray(caption);
    }

    @Override
    public abstract_factory.factory.Page createPage(String title, String author) {
        return new DivPage(title, author);
    }

}
