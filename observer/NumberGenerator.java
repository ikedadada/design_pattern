package observer;

import java.util.List;
import java.util.ArrayList;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();

}
