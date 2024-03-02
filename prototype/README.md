# Prototypeパターン
## 登場人物
### Prototype役
インスタンスをコピーして新しいインスタンスを作るためのメソッドを定める抽象クラスまたはインターフェース。
=> \<E> createCopy(){}

Clonableインターフェースを埋め込むと、cloneメソッドが利用でき、以下のようにコピーができる。
```framework/Product.java
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
```

### ConcretePrototype役
インスタンスをコピーするメソッドを実際に実装する。

### Client役
Prototype役に定義されたコピーメソッドを利用し、新しいインスタンスを作成する。


## 関連しているパターン
- Flyweightパターン
Prototypeパターンでは、現在のインスタンスと同じ状態の別のインスタンスを作って利用する。
Flyweightパターンでは1津のインスタンスを複数の場所で共有して利用する。

- Mementoパターン
Mementoパターンでは、スナップショットとアンドゥを行うために、現在のインスタンスの状態を保存します。

- Compositeパターン
CompositeパターンやDecoratorパターンを多用しているとき、複雑な構造のインスタンスを動的に作る場合、Prototypeパターンを利用すると便利なことがある

- Commandパターン
Commandパターンに登場する命令を複製したいときにPrototypeパターンが使われることがある
