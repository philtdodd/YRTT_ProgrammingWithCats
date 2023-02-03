package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends AbstractCat {
    private static final int AVG_HEIGHT = 23;
    private final Random random;

    public DomesticCat() {
        super(AVG_HEIGHT, true);

        random = new Random();
        random.setSeed(System.currentTimeMillis());
    }

    @Override
    public String eat() {
        if (random.nextBoolean())
            return "Purrrrrrr";
        return "It will do I suppose";
    }
}
