# Commandパターン
## 登場人物
### Command役
命令のインターフェースを定義する。

### ConcreteCommand役
Command役のインターフェースの具体的な実装。

### Receiver役
Command役が命令を実行するときに対象となる役。

### Client役
CocreteCommand役を生成し、その際にReceiver役を割り当てる。

### Invoker役
命令の実行を開始する役。Command役で定義されているインターフェースを呼び出す。

## 無名クラス
クラスの実装をその場で行うクラス

## 関連しているパターン
- Compositeパターン
マクロコマンドを実現するためにCompositeパターンが利用される場合がある。

- Mementoパターン
Command役の履歴を保存するときにMementoパターンが使われる場合がある。

- Prototypeパターン
発生したイベントを複製したい場合にPrototypeパターンが使われる場合がある。
