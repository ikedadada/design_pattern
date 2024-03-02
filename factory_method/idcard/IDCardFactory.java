package factory_method.idcard;


public class IDCardFactory extends factory_method.framework.Factory {

    @Override
    protected factory_method.framework.Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(factory_method.framework.Product product) {
        System.out.println(product + "を登録しました。");
    }

}
