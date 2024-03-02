package singleton;

import java.io.Serializable;

// enumでのSingletonと同じようにSerializableを実装することでシリアライズに対応できる
public class Singleton implements Serializable {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("インスタンスを生成しました");
    }

    public static Singleton getInstance() {
        return singleton;
    }

    protected Object readResolve() {
        return singleton;
    }

}
