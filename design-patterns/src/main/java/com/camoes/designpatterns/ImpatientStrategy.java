package com.camoes.designpatterns;

public class ImpatientStrategy implements OrderingStrategy {
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) { }

    @Override
    public void happyHourEnded(StringBar bar) { }
}
