package bridge.challenge;

import java.util.Random;

public class RandomDisplay extends bridge.CountDisplay {
    private static Random random = new Random();

    public RandomDisplay(bridge.DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int maxTimes) {
        int times = random.nextInt(maxTimes);
        multiDisplay(times);
    }

}
