# Templateパターン
## 登場人物
### AbstractClass役
テンプレートメソッドを定義し、テンプレートメソッド内で利用されるそれぞれの処理を抽象メソッドとして定義する。

### ConcreteClass役
AbstractClass役で定義された抽象メソッドを実装する役。
抽象メソッドを実装するだけで、テンプレートメソッドから実際の処理を呼び出すことができる。

## 関連するパターン
### Factory Methodパターン
Template Methodパターンをインスタンス生成に応用している。

### Strategyパターン
Template Methodパターンでは「継承」でプログラムの動作を変更している。
Strategyパターンでは「委譲」によってプログラムの動作を変更する。
