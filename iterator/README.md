# Iteratorパターン
## 登場人物
### Iterator役
要素を順番にスキャンするためのAPIを提供するインターフェース。
次の要素が存在するかどうかを得るためのhasNext、次の要素を得るためのnextメソッドを定義する。
=> Iterator\<E\>

```iterator.class
package java.util;

import java.util.function.Consumer;

public interface Iterator<E> {
   boolean hasNext();

   E next();

   default void remove() {
      throw new UnsupportedOperationException("remove");
   }

   default void forEachRemaining(Consumer<? super E> action) {
      Objects.requireNonNull(action);

      while(this.hasNext()) {
         action.accept(this.next());
      }

   }
}

```

### ConcreteIterator役
Iteratorのインターフェースの具体的な実装。
内部にスキャンのためのデータと現在アクセスされているIndexに関する情報を持つ。

### Aggregate役
Iterator役を作り出すためのインターフェース。順番に要素をスキャンするためのメソッドを定義する。
=> Iterable\<E\>

```iterable.class
// Source code is decompiled from a .class file using FernFlower decompiler.
package java.lang;

import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public interface Iterable<T> {
   Iterator<T> iterator();

   default void forEach(Consumer<? super T> action) {
      Objects.requireNonNull(action);
      Iterator var2 = this.iterator();

      while(var2.hasNext()) {
         T t = var2.next();
         action.accept(t);
      }

   }

   default Spliterator<T> spliterator() {
      return Spliterators.spliteratorUnknownSize(this.iterator(), 0);
   }
}

```

### ConcreteAggregate役
Aggregateのインターフェースの具体的な実装。
ConcreteIterator役のインスタンスを作り出し、内部に保持する。

## 関連しているパターン
### Visitorパターン
Iteratorパターンは集合体の要素を一つずつ処理するが、その処理の内容までは定義されない。
（どう使うかはClient役次第）
Visitorパターンはたくさんの要素を渡り歩きながら、同じ処理を繰り返し適応する。

### Compositeパターン
再帰的な処理を記述するパターン

### Factory Methodパターン
iteratorメソッドがIteratorインスタンスを生成する際にFactory Methodパターンが使われる場合がある。
