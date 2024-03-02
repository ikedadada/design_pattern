package factory_method.idcard;

public class IDCard extends factory_method.framework.Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + "のカードを使います。");
    }

    @Override
    public String toString() {
        return "[IDCard:" + this.owner + "]";
    }

    public String getOwner() {
        return this.owner;
    }

}
