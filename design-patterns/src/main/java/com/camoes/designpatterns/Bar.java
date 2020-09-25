package com.camoes.designpatterns;

import java.util.List;

public abstract class Bar {
    private boolean happyHour;
    private List<BarObserver> observers;

    public Bar(boolean happyHour, List<BarObserver> observers) {
        this.happyHour = happyHour;
        this.observers = observers;
    }

    public boolean isHappyHour(){
        return happyHour;
    }

    public void startHappyHour(){
        this.happyHour = true;
        notifyObservers();
    }

    public void endHappyHour(){
        this.happyHour = false;
        notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }


}
