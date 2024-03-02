package strategy;

public enum Hand {
    Rock("Rock", 0), Scissors("Scissors", 1), Paper("Paper", 2);

    private String name;
    private int value;

    private Hand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    private static final Hand[] hands = {Rock, Scissors, Paper};

    public static Hand getHand(int handValue) {
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        boolean isWin = (this.value + 1) % 3 == h.value;
        if (isWin) {
            return 1;
        }
        boolean isAiko = this == h;
        if (isAiko) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return name;
    }

}
