package com.camoes.designpatterns;

public class StringReplacer implements StringTransformer {
    private char changee;
    private char changer;

    public StringReplacer(char changee, char changer) {
        this.changee = changee;
        this.changer = changer;
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuffer str = new StringBuffer(drink.getText());
        int ln = str.length();

        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            char c = str.charAt(i);
            if (c == changee)
                str.replace(i, i+1, changer+"");
        }

       drink.setText(str.toString());
    }

}
