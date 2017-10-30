package algorithms.implementation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BreakingRecordsTest {
    @Test
    void breakingRecordsTest1() {
        // 10 5 20 20 4 5 2 25 1
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] results = {2, 4};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
    }

    @Test
    void breakingRecordsTest2() {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] results = {4, 0};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
    }


    @Test
    void breakingRecordsTest3() {
        int[] scores = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] results = {0, 9};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
    }
}
