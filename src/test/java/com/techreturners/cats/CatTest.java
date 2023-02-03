package com.techreturners.cats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake by default");
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue(domesticCat.isAsleep(), "Cat should be snoozing");
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse(domesticCat.isAsleep(), "Cat should be awake now");
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }


    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }

    @Test
    public void checkNotDomesticTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assert(!cheetahCat.isCatDomestic());
    }

    @Test
    public void feedTheCat() {
        Cat domesticCat = new DomesticCat();
        String response;

        /*
         * Run the tests until both return values have been
         * returned or assert false if 100 tests have not produced
         * both messages so the test does not loop forever.
         */
        int iterations = 0;
        final int MAX_ITERATIONS = 100;
        boolean hasPurred = false;
        boolean hasBeenDismissive = false;


        while (!(hasPurred && hasBeenDismissive) && iterations < MAX_ITERATIONS) {
            response = domesticCat.eat();

            switch (response) {
                case "Purrrrrrr":
                    hasPurred = true;
                    break;
                case "It will do I suppose":
                    hasBeenDismissive = true;
                    break;
            }

            assertThat(response, isOneOf("Purrrrrrr", "It will do I suppose"));
            iterations++;
        }

        assert (iterations < MAX_ITERATIONS);
    }
}
