package ex01;

import java.util.ArrayList;

public class Borsa {
    private ArrayList<Observer> observers;
    private double preu;

    public Borsa() {
        observers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPreu(double nouPreu) {
        if (nouPreu != preu) {
            preu = nouPreu;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(preu);
        }
    }
}
