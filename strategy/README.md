# Strategyパターン
## 登場人物
### Strategy役
戦略（アルゴリズム）を利用するためのインターフェースを定める役

### ConcreteStrategy役
Strategy役のインターフェースを実際に実装する役

### Context役
Strategy役を利用する役。


## 関連するパターン
- Flyweightパターン
ConcreteStrategy役は、Flyweightパターンを使って複数個所から共有できる場合がある。

- Abstract Factoryパターン
Strategyパターンでは、アルゴリズムをごっそり切り替えることができるが、
Abstract Factoryパターンでは、具体的な工場、製品、部品をごっそり切り替えることができる。

- Stateパターン
StrategyパターンもStateパターンもともに委譲先を切り替えるパターンであり、クラス間の関係もよく似ている。
が、両方のパターンは目的が異なっている。
Strategyパターンでは「アルゴリズム」を表現するクラスを作成し、それをConcreteStrategy役とする。
一方で、Stateパターンでは、「状態」を表現するkラスを作成し、それをConcreteState役とする。
Stateパターンでは状態が変化するたびに委譲先のクラスが必ず切り替わります。

