package seminar_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    @Test
    void evenOddNumber() {
        MainHW item = new MainHW();
        assertTrue(item.evenOddNumber(2), "Number " + 2 + " should be even");
        assertFalse(item.evenOddNumber(3), "Number " + 3 + " should not be even");
    }

    @Test
    void numberInInterval() {
        MainHW item = new MainHW();
        assertTrue(item.numberInInterval(26), "Number " + 26 + " is in the interval");
        assertFalse(item.numberInInterval(24), "Number " + 24 + " is not in the interval");
    }
}