package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Tray;
import abstract_factory.factory.Page;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Main class.name.of.ConcreteFactory class.name.of.ConcreteFactory");
            System.out.println(
                    "Example 1: java abstract_factory.Main list.html listfactory.ListFactory");
            System.out.println(
                    "Example 2: java abstract_factory.Main div.html divfactory.DivFactory");
            System.exit(0);
        }

        String fileName = args[0];
        String factoryName = args[1];

        Factory factory = Factory.getFactory(factoryName);

        Link blog1 = factory.createLink("ブログ1", "http://blog1.com");
        Link blog2 = factory.createLink("ブログ2", "http://blog2.com");
        Link blog3 = factory.createLink("ブログ3", "http://blog3.com");

        Tray blogTray = factory.createTray("ブログ");
        blogTray.addItem(blog1);
        blogTray.addItem(blog2);
        blogTray.addItem(blog3);

        Link news1 = factory.createLink("ニュース1", "http://news1.com");
        Link news2 = factory.createLink("ニュース2", "http://news2.com");
        Link news3 = factory.createLink("ニュース3", "http://news3.com");

        Tray newsTray = factory.createTray("ニュース");
        newsTray.addItem(news1);
        newsTray.addItem(news2);
        newsTray.addItem(news3);

        Page page = factory.createPage("LinkPage", "Author");
        page.add(blogTray);
        page.add(newsTray);

        page.output(fileName);

    }

}
