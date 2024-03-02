# Mediatorパターン
## 登場人物
### Mediator役
Colleague役と通信を行って調整を行うためのインターフェースを定める。

### ConcreteMediator役
Mediator役のインターフェースを実装し、実際の調整を行う。

### Colleague役
Mediator役との通信を行うインターフェースを定める。

### ConcreteColleague役
Colleague役のインターフェースを実装する。

## 関連するパターン
- Facadeパターン
Mediatorパターンでは、Mediator役がColleague役の仲介者として　やり取りを行う
FacadeパターンではFacade役が一方的にほかの役を利用する都合上、一方通行になる。

- Observerパターン
Mediator役とColleague役の通信は、Observerパターンを使って行われる場合がある。
