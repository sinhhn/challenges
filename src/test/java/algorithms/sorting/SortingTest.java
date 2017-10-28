package algorithms.sorting;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class SortingTest {
    @Test
    void bigSortingTest() {
        String[] unsorted = new String[]{"31415926535897932384626433832795", "01", "3", "10", "3", "5"};
        String[] sorted = new String[]{"01", "3", "3", "5", "10", "31415926535897932384626433832795"};
        Assert.assertArrayEquals(sorted, BigSorting.bigSort(unsorted));
    }

}
