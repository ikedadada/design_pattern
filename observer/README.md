# Observerパターン
## 登場人物
### Subject役
観察される側のOserver役を登録するメソッド、削除するメソッド、現在の状態を取得するメソッドを定義する。

### ConcreteSubject役
観察される側の具体的な実装。
現在の状態が変更された場合、登録されているObserver役に通知する。

### Observer役
Subject役から状態が変わったことを通知してもらう役。サンプルではそのためにupdateメソッドを定義した。

### ConcreteObserver役
Observerの具体的な実装。Subjectから状態の変更を通知されたときの具体的な実装を持つ。

## 関連するパターン
- Mediatorパターン
MediatorパターンではMediator役とColleague役の通信にObserverパターンを使う場合がある。
MediatorパターンとObserverパターンはどちらも状態返還を通知するという点で似ているが目的が異なる。
Mediatorパターンでも状態の変化が通知されるがMediatorはColleagueの調停という目的で動くMediatorの役割の一部に過ぎない。
Observerパターンでは、Subjec4t役の状態変化をObserver役に通知すること、通知して同期をとることに主眼がある。
