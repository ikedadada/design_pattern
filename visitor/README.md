# Visitorパターン
## 登場人物
### Visitor役
データ構造の具体的な要素ごとにオーバーロードしながらvisitメソッドを定義するインターフェース。

### ConcreteVisitor役
Visitor役のインターフェースを実装し、個々のConcreteElementごとに処理を記述する。


### Element役
Visitorの訪問先を表す役で、Visitor役を受け入れるacceptメソッドを定義する。
acceptメソッドの引数にはVisitor役が渡される。

### ConcreteElement役
Element役のインターフェースを実装する役。

### ObjectStracture役
ObjectStructure役はElement役の集合を扱う役。
サンプルではConcreteVisitor役が個々のElementを扱えるようにIterableインターフェースを埋め込み、iteratorメソッドを内部で実装した。

## 関連するパターン
- Iteratorパターン
IteratorパターンもVisitorパターンもあるデータ構造上で処理を行う。
Iteratorパターンは、データ構造が保持している要素を一つ一つ得るのに使う。
Visitorパターンは、データ構造が保持している要素に特定の処理を施すのに使う。

- Compositeパターン
訪問先になるデータ構造はCompositeパターンになる場合がある。

- Iterpreterパターン
Interpreterパターンでは、Visitorパターンが使われる場合がある。
例えば構文木を作った後、構文器の各ノードを巡回しながら処理を行うようなとき。
