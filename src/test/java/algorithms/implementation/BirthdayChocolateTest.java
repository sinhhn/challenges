package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayChocolateTest {
    @Test
    void birthDayChocolateTest1() {
        int[] s = {1, 2, 1, 3, 2};
        int d = 3, m = 2;
        assertEquals(2, BirthdayChocolate.solve(s, d, m));
    }

    @Test
    void birthDayChocolateTest2() {
        int[] s = {1, 1, 1, 1, 1};
        int d = 3, m = 2;
        assertEquals(0, BirthdayChocolate.solve(s, d, m));
    }

    @Test
    void birthDayChocolateTest3() {
        int[] s = {4};
        int d = 4, m = 1;
        assertEquals(1, BirthdayChocolate.solve(s, d, m));
    }
}
