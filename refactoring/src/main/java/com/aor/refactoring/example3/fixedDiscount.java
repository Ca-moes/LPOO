package com.aor.refactoring.example3;

public class fixedDiscount implements Discount {
    private final int fixed;

    public fixedDiscount(int fixed) {
        this.fixed = fixed;
    }

    @Override
    public double applyDiscount(double price) {
        return fixed > price ? 0 : price - fixed;
    }
}
