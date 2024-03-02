package prototype.challenge_1;

import prototype.framework.Product;
import prototype.framework.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        manager.register("Strong Message", upen);
        manager.register("Warning Box", mbox);
        manager.register("Slash Box", sbox);

        Product p1 = manager.create("Strong Message");
        Product p2 = manager.create("Warning Box");
        Product p3 = manager.create("Slash Box");

        p1.use("Hello, world.");
        p2.use("Hello, world.");
        p3.use("Hello, world.");
    }

}
