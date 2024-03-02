# Factory Methodパターン
## 登場人物
### Product役
生成されるインスタンスが持つべきメソッドを定める抽象クラス。

### Creator役
Productのインスタンスを生成するためのメソッドを定める抽象クラス。

### ConcreteProduct役
実際に生成されたインスタンスが持つべきメソッドの具体的な実装をもつ。

### ConcreateCreator役
ConcreteProductのインスタンスを作るためのメソッドの具体的な実装を持つ。

## 関連しているパターン
### Template Methodパターン
Factory MethodパターンはTemplateMethodパターンの応用。
サンプルではcreateメソッドがテンプレートメソッドになっている。

### Singletonパターン
Create役を務めるクラスは多くの場合、Singletonとして作ることができる。

### Compositeパターン
Product役にCompositeパターンを当てはめることができる場合がある。
（Productが階層構造を持つような場合）

### Iteratorパターン
iteratorメソッドがIteratorのインスタンスを作成するときにFactoryMethodパターンが使われることがある。

