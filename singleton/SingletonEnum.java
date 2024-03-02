package singleton;

public enum SingletonEnum {
    INSTANCE;

    public void show() {
        System.out.println("SingletonEnumのインスタンスメソッドが呼ばれました");
    }

}
