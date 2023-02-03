package com.techreturners.cats;

public class CheetahCat extends AbstractCat {
    private static final int AVG_HEIGHT = 900;

    public CheetahCat() {
        super(AVG_HEIGHT, false);
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }
}
