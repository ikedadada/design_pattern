package observer.challenge;

public class IncrementalNumberGenerator extends observer.NumberGenerator {
    private int startNumber;
    private int endNumber;
    private int increment;
    private int number;

    public IncrementalNumberGenerator(int startNumber, int endNumber, int increment) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.increment = increment;
        this.number = startNumber;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = startNumber; i < endNumber; i += increment) {
            number = i;
            notifyObservers();
        }
    }


}
