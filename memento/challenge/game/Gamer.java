package memento.challenge.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();

    private Random random = new Random();

    private static String[] fruitsName = {"リンゴ", "ブドウ", "バナナ", "みかん"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;

        switch (dice) {
            case 1:
                money += 100;
                System.out.println("所持金が増えました。");
                return;

            case 2:
                money /= 2;
                System.out.println("所持金が半分になりました。");
                return;
            case 6:
                String f = getFruit();
                System.out.println("フルーツ(" + f + ")をもらいました。");
                fruits.add(f);
                return;
        }

        return;

    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String f : fruits) {
            if (f.startsWith("おいしい")) {
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }

    private String getFruit() {
        String f = fruitsName[random.nextInt(fruitsName.length)];
        if (random.nextBoolean()) {
            f = "おいしい" + f;
        }
        return f;
    }

}
