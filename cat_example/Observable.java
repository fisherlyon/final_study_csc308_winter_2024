package cat_example;

import java.util.LinkedList;

public abstract class Observable {
    private LinkedList<Observer> observers = new LinkedList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
