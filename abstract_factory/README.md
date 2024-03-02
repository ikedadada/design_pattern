# Abstract Factoryパターン
## 登場人物
### AbstractProduct役
AbstractFactory役から作り出される部品や製品のインターフェースを定める

### AbstractFactory役
AbstractProductを作り出すためのインターフェースを定める

### ConcreteProduct役
AbstractProductのインターフェースを実装するクラス

### ConcreteFactory役
AbstractFactoryのインターフェースを実装するクラス

## 関連しているパターン
- Builderパターン
AbstractFactoryパターンはインターフェースが定まっている抽象的な部品を組み合わせて複雑な構造を持ったインスタンスを作る
Builderパターンは段階を追って大きなインスタンスを作る

- Factory Methodパターン
Abstract Factoryパターンで製品や部品を作るところはFactory Methodパターンになることがある。

- Compositeパターン
Abstract Factoryパターンで作られる製品はCompositeパターンになることがある。

- Singletonパターン
Abstract FactoryパターンのConcreteFactory役はSingletonパターンになることがある。
