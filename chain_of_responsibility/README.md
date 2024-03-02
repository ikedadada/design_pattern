# Chain Of Responsibilityパターン
## 登場人物
### Handler役
要求を処理するインターフェースを定める抽象クラス。
内部に処理をたらい回すHandler役を保持する。

### ConcreteHandler役
Handler役のインターフェースを実装するクラス。

## 関連するパターン
- Compositeパターン
Handler役にCompositeパターンが登場することがよくある。

- Commandパターン
Handler役に対して投げられる「要求」にはCommandパターンが使われる場合がある。
