# flyweight パターン

## 登場人物

### flyweight 役

普通に使うとプログラムが重くなるので共有したほうが良いものを表す役。

### flyweightFactory 役

Flyweight を作る工場薬。この工場を使って Flyweight 役を作るとインスタンスが共有される。

## 関連するパターン

### Proxy パターン

Flyweight パターンではインスタンスの生成に時間がかかる場合、インスタンスを共有することで処理効率を上げる。
Proxy パターンでは、代理人を立てることで処理スピードを上げる。

### Composite パターン

Flyweight パターンを使って Composite パターンの Leaf 役を共有できる場合がある

### Singleton パターン

FlyweightFactory 役は Singleton になる場合がある。
Singleton になった FlyweightFactory 役が返す Flyweight 役はすべてで共有されるため、Singleton 役のインスタンスは intrinsic な情報しか持たない
