# Decoratorパターン
## 登場人物
### Component役
機能を追加する際の核のインターフェースを定める役。

### ConcreteComponent役
Component役のインターフェースを実装する役。

### Decorator役
Component役と同じインターフェースを持ち、このDecorator役が飾る対象となるComponentを内部に保持する。

### ConcreteDecorator役
具体的なDecorator役。

## 関連するパターン
- Adapterパターン
Decoratorパターンは中身のインターフェースを変えずに外枠を作る。
Adapterパターンはずれのある2津のインターフェースをつなぐために用いられる。

- Strategyパターン
Decoratorパターンは、外枠を取り替えたり、外枠重ねたりして機能を追加する。
Strategyパターンはアルゴリズムを切り替えて機能を変更する。

- Compositeパターン
Decoratorパターンは機能を柔軟に追加するために再帰的な構造を利用する。
Compositeパターンは、機能を追加するところではなく、容器と中身を同一視するところに主眼がある。
