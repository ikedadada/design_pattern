package observer.challenge;

import observer.DegitObserver;
import observer.GraphObserver;
import observer.NumberGenerator;
import observer.Observer;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);
        Observer observer1 = new DegitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();

    }

}
