package strategy.challenge;

import java.util.Random;

public class RandomStrategy implements strategy.Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public strategy.Hand nextHand() {
        return strategy.Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {}

}
