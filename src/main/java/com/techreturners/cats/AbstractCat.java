package com.techreturners.cats;

public abstract class AbstractCat implements Cat {
    private boolean isAsleep;
    private final int averageHeightCM;
    private final boolean isDomestic;

    public AbstractCat(int averageHeightCM, boolean isDomestic) {
        this.averageHeightCM = averageHeightCM;
        this.isDomestic = isDomestic;
        isAsleep = false;
    }

    public boolean isCatDomestic() {
        return isDomestic;
    }

    public String getSetting() {
        if (isDomestic) {
            return "domestic";
        }
        return "wild";
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

    @Override
    public int getAverageHeight() {
        return averageHeightCM;
    }

    @Override
    public String eat() {
        return "num nums";
    }
}
