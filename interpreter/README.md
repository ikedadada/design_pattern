# Interpreterパターン
## 登場人物
### AbstractExpression役
構文木のノードに共通のインターフェースを定める役。

### TerminalExpression役
BNFのターミナルエクスプレッション（終着駅）に対応する役

### NonterminalExpression役
BNFのノンターミナル・えくぅぷれっしょんに対応する役

### Context役
インタプリタが構文解析を行うための情報を提供する役

## 関連しているパターン
- Compositeパターン
NonterminalExpression役は再帰的な構造を持つことが多いのでCompositeパターンを使って表現されることがある。

- Flyweightパターン
TerminalExpression役は、Flyweightパターンを使って共有される場合もある。

- Visiterパターン
構文木を作った後、構文木の各ノードを巡回しながら処理を行う時には、Visiterパターンが使われる場合がある。