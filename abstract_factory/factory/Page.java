package abstract_factory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output(String filename) {
        try (var writer = new java.io.FileWriter("abstract_factory/" + filename)) {
            writer.write(this.makeHTML());
            System.out.println(filename + "を作成しました。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();

}
