package bridge.challenge;

public class Main {
    public static void main(String[] args) {
        RandomDisplay d1 = new RandomDisplay(new FileDisplayImpl("bridge/challenge/sample.txt"));
        d1.randomDisplay(10);
    }

}
