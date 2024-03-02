package factory_method.challenge.idcard;

import java.util.ArrayList;

public class IDCardFactory extends factory_method.challenge.framework.Factory {
    ArrayList<String> owners = new ArrayList<>();

    @Override
    protected factory_method.challenge.framework.Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(factory_method.challenge.framework.Product product) {
        owners.add(((IDCard) product).getOwner());
        System.out.println("ID:" + owners.size() + "で" + product + "を登録しました。");
    }

}
