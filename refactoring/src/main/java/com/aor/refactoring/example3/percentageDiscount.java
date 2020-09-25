package com.aor.refactoring.example3;

public class percentageDiscount implements Discount {
    private final double percentage;

    public percentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price - price * percentage;
    }
}
