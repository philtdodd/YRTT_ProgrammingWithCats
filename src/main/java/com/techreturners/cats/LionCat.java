package com.techreturners.cats;

public class LionCat extends AbstractCat {
    private static final int AVG_HEIGHT = 1100;

    public LionCat() {
        super(AVG_HEIGHT, false);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }
}
