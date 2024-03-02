# Proxyパターン
## 登場人物
### Subject役
Proxy役とRealSubject役を同一視するためのインターフェース

### Proxy役
Proxy役はClientからの要求をできるだけ処理しますが、自分だけで処理できないものはRealSubject役に仕事を任せる。Proxy役はRealSubject役が必要になってからRealSubject役を生成する。

### RealSubject役
Proxy役では手に負えなくなった時に登場する「本人」役。

## さまざまなProxy
- Virtual Proxy
本当にインスタンスが必要になった時点で生成・初期化を行う

- Remote Proxy
Remote ProxyはRealSubject役がネットワークの向こうにあるにもかかわらず、あたかも自分のそばにいるようにメソッドの呼び出しができるもの。RMI（遠隔メソッド呼び出し）などがこれに相当する

- Access Proxy
RealSubjectの機能に対してアクセス制限を設けるもの。
定められたユーザーならメソッドの呼び出しを許可しますが、それ以外はエラーになるような処理を行うプロキシ

## 関連するパターン
-  Adapterパターン
Adapterパターンはインターフェースが異なるオブジェクトの間を埋める働きをする。
一方でProxyパターンはProxy役とRealSubject役の間でインターフェースは異ならない。

- Decoratorパターン
どちらも透過的なインターフェースを用いているが、Decoratorパターンは機能の追加を目的とするのに対し、Proxyパターンは本人の作業を肩代わりして本人へのアクセスを軽減するという目的がある。

