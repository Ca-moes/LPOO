package com.camoes.designpatterns;

import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    public void mix(StringDrink drink){
        for (StringTransformer stringTransformer : transformers){
            stringTransformer.execute(drink);
        }
    }
}
