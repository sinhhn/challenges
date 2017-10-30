package algorithms.sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BigSortingTest {

    @Test
    void bigSortingTest1() {
        String[] unsorted = new String[]{"31415926535897932384626433832795", "01", "3", "10", "3", "5"};
        String[] sorted = new String[]{"01", "3", "3", "5", "10", "31415926535897932384626433832795"};
        Assert.assertArrayEquals(sorted, BigSorting.bigSort(unsorted));
    }

    @Test
    void bigSortingTest2() {
        String[] unsorted = new String[]{"3113", "2111", "3131", "10", "3", "5", "99", "100", "1"};
        String[] sorted = new String[]{"1", "3", "5", "10", "99", "100", "2111", "3113", "3131"};
        Assert.assertArrayEquals(sorted, BigSorting.bigSort(unsorted));
    }
}
