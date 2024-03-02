# Mementoパターン
## 登場人物
### Originator役
自分の現在の状態を保存したいときにMemento役を作り、以前のMementoが渡されたときにその時の状態に戻る処理を持つ

### Memento役
Originator役の内部情報をまとめて持つ。
Memento役が持つAPIは2種類に分けられる。

- wide interface ... 広いインターフェース
オブジェクトの状態を元に戻すために必要な情報が得られるメソッドの集合。
Memento役の内部状態をさらけ出してしまうので、これを使えるのはOriginator役だけ。

- narrow interface ... 狭いインターフェース
外部のCaretaker役に見せるメソッド群。
内部状態が外部に公開されるのを防ぐ。

### Caretaker役
現在のOriginator役の状態を保存したいときに、Originator役にそのことを伝える。
Originator役はそれを受けてMemento役を作り、Caretaker役に渡す。
Caretaker役は将来に備えてMemento役を保存しておく。

## 関連しているパターン
- Commandパターン
Commandパターンを使って命令を処理する場合にMementoパターンを使ってUndoやRedoが行える。

- Prototypeパターン
Mementoパターンではスナップショットとアンドゥのため、現在のインスタンスの状態を保存する。
Prototypeパターンでは現在のインスタンスと同じ状態の別のインスタンスを作る。

- Stateパターン
Mementoパターンではインスタンスが「状態」を表現する。
Stateパターンではクラスが「状態」を表現する。
