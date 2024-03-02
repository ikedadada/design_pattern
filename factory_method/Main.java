package factory_method;

import factory_method.challenge.framework.Factory;
import factory_method.challenge.framework.Product;
import factory_method.challenge.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("結城浩");
        Product card2 = factory.create("とむら");
        Product card3 = factory.create("イケダ");

        card1.use();
        card2.use();
        card3.use();
    }

}
