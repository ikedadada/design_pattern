# Bridgeパターン
## 登場人物
### Abstraction役
「機能クラスの階層」の最上位クラス。
Implementor役を保持し、Implementor役のメソッドを使って基本的な機能だけが記述されている。（Implementor役を委譲する）

### RefinedAbstraction役
Abstraction役を継承し、機能の追加を実装した役。

### Implementor役
「実装のクラス階層」の最上位クラス。
Abstraction役のインターフェースを実装するためのメソッドを規定する。

### ConcreteImplementor役
具体的なImplementor役のインターフェースを実装するクラス。


## 関連するパターン
- Templete Methodパターン
Template Methodパターンでは実装のクラス階層を利用する。

- Abstract Factoryパターン
Bridgeパターンに登場するConcreteImplementor役を環境に合わせて適切に構築するために、Abstract Factoryパターンが用いられる場合がある。

- Adaptorパターン
Bridgeパターンは、機能の改装と実装の改装をきちんと分離したうえで結合させるパターンで、
Adaptorパターンは機能は似ているが、インターフェースが異なるクラス同士を結合させるパターン。
