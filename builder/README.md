# Builderパターン
## 登場人物
### Builder役
インスタンスを作成するためのインターフェースを定義する。

### ConcreteBuilder役
Builderのインターフェースを実装し、実際のインスタンス作成で利用されるメソッドを実装する。
また、最終的にできた結果を得るためのメソッドも用意される。

### Director役
Builder役のインターフェースを使ってインスタンスの生成を行うメソッドを実装する。


## 関連しているパターン
- Templateパターン
BuilderパターンではDirector役がBuilder役をコントロールしますが、Template Methodパターンではスーパークラスがサブクラスをコントロールする。

- Conposite（複合）パターン
Builderパターンで得られる生成物はCompositeパターンになる場合がある。

- Abstract Factoryパターン
BuilderパターンもAbstract Factoryパターンも複雑なインスタンスを生成する

- Facade（建物を正面から見たときの外観）パターン
BuilderパターンのDirector役は、Builder役の複雑なメソッドを組み合わせて、インスタンスを構築するインターフェースを外部に提供する。
FacadeパターンのFacade役は、内部モジュールを組み合わせて作業を行うための単純なインターフェースを外部に提供する。

