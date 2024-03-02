# Compositeパターン
## 登場人物
### Leaf役
終端の「中身」を表す役。この役の中にはほかのものを入れることができない。

### Composite役
「容器」を表す役。Leaf役やComposite役を中に入れることができる。

### Component役
Leaf役とComposite役を同一視するための役。

## 関連するパターン
- Commandパターン
Commandパターンで「マクロコマンド」を作る時に、Compositeパターンが使われる。

- Visitorパターン
VisitorパターンではCompositeを巡りながら処理するのに使う。

- Decoratorパターン
Compositeパターンは容器（Composite）と中身（Leaf）をComponent役として同一視する。
Decoratorパターンは飾り枠と中身を同一視する。
