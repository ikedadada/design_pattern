# Facadeパターン
## 登場人物
### Facade役
システムを構成するその他大勢の役の「シンプルな窓口」役になり、高レベルでシンプルなインターフェースをシステム外部に提供する。

### システムを構成しているその他大勢の役
その他大勢の役はそれぞれの仕事を行いますが、Facade役のことを意識することはない。

## 関連するパターン
- Abstract Factoryパターン
Abstract Factoryパターンはオブジェクト生成という複雑な作業に関するFacadeパターンとみなすこともできる

- Singletonパターン
Facade役がSingletonパターンとして作られる場合がある。

- Mediatorパターン
FacadeパターンではFacade役が一方的にほかのやくをりようして　高レベルなインターフェースを作った。
MediatorパターンではMediator役がColleague役の仲介者として槍を利を行う。
Facadeパターンは一方方向だが、Mediatorパターンは双方向といえる。
