# Stateパターン
## 登場人物
### State役
State役は状態をあわら市、状態ごとに異なる振る舞いをするメソッドのインターフェースを定義する。

### ConcreteState役
具体的な個々の状態を表現し、State役で定義されたインターフェースの具体的な実装を持つ

### Context役
現在の状態を表すConcreteStateを持ち、Stateパターンの利用者に必要なインターフェースを定める。

## 関連するパターン
- Singletonパターン
ConcreteState役（状態を表すクラス）はインスタンスフィールドを持たないので、Singletonパターンとして実装されることが多い。

- Flyweightパターン
状態を表すクラスはインスタンスフィールドを持たないのでFlyweightパターンを使って、ConcreteState役を複数のContext役で共有できる場合もある。

