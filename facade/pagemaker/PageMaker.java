package facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("facade/maildata");
            String username = mailprop.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title(username + "'s Web Page");
            writer.paragraph("Welcome to " + username + "'s page.");
            writer.paragraph("Please email me at this address.");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String filename) {
        try {
            Properties mailprop = Database.getProperties("facade/maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Link page");
            mailprop.forEach((k, v) -> {
                try {
                    writer.mailto((String) k, (String) v);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();
            System.out.println(filename + " is created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
