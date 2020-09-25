package com.camoes.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {

    public StringBar(boolean happyHour, List<BarObserver> observers) {
        super(happyHour, observers);
    }

    public StringBar(){
        super(false, new ArrayList<>());
    }

    public void order(StringDrink stringDrink, StringRecipe stringRecipe){
        stringRecipe.mix(stringDrink);
    }
}
