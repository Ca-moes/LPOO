package com.aor.numbers;

public class DivisibleByFilter implements IListFilter {
    private Integer integer;

    public DivisibleByFilter(Integer number) {
        this.integer = number;
    }

    @Override
    public boolean accept(Integer number) {
        return number % integer == 0;
    }
}
