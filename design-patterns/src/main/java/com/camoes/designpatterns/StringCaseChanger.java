package com.camoes.designpatterns;

public class StringCaseChanger implements StringTransformer {

    public StringCaseChanger(){}

    @Override
    public void execute(StringDrink drink) {
        StringBuffer str = new StringBuffer(drink.getText());
        int ln = str.length();

        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
        }

        drink.setText(str.toString());
    }

}
