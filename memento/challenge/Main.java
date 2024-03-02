package memento.challenge;

import memento.challenge.game.Gamer;
import memento.challenge.game.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = Memento.loadFromFile("memento/challenge/game.dat");
        if (memento != null) {
            System.out.println("以前に保存した結果からスタートします。");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新規にスタートします。");
        }

        memento = gamer.createMemento();

        for (int i = 0; i < 100; i++) {
            System.out.println("===== " + i);
            System.out.println("現状：" + gamer);

            gamer.bet();

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("*だいぶ増えたので現在の状態を保存しておこう");
                memento = gamer.createMemento();
                Memento.saveToFile("memento/challenge/game.dat", memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("*だいぶ減ったので以前の状態に復帰しよう");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

}
