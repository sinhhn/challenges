package algorithms.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleSumPairsTest {
    @Test
    void divisibleSumPairsTest1() {
        int[] arr = {1, 3, 2, 6, 1, 2};
        assertEquals(5, DivisibleSumPairs.divisibleSumPairs(3, arr));
    }


    @Test
    void divisibleSumPairsTest2() {
        int[] arr = {1, 3, 2, 6, 1, 2};
        assertEquals(15, DivisibleSumPairs.divisibleSumPairs(1, arr));
    }

    @Test
    void divisibleSumPairsTest3() {
        int[] arr = {1, 3, 7};
        assertEquals(0, DivisibleSumPairs.divisibleSumPairs(3, arr));
    }
}
