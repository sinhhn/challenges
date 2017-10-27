package algorithms.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import algorithms.implementation.*;
import algorithms.string.ReducedString;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ImplementationTest {

    @Test
    void breakingRecordsTest() {
        // 10 5 20 20 4 5 2 25 1
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] results = {2, 4};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
    }

    @Test
    void divisibleSumPairsTest() {
        int[] arr = {1, 3, 2, 6, 1, 2};
        assertEquals(5, DivisibleSumPairs.divisibleSumPairs(3, arr));
    }

    @Test
    void gradingStudentTest() {
        int[] grades = {73, 67, 38, 33};
        int[] results = {75, 67, 40, 33};
        Assert.assertArrayEquals(results, GradingStudents.solve(grades));
    }

    @Test
    void sockMerchantTest1() {
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(3, SockMerchant.sockMerchant(ar));
    }

    @Test
    void sockMerchantTest2() {
        int[] ar = {10, 20};
        assertEquals(0, SockMerchant.sockMerchant(ar));
    }

    @Test
    void sockMerchantTest3() {
        int[] ar = {10, 10, 10};
        assertEquals(1, SockMerchant.sockMerchant(ar));
    }

    @Test
    void kangarooTest() {
        assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2));
    }

    @Test
    void twoSetsTest() {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};
        assertEquals(3, TwoSets.getTotalX(a, b));
    }

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


    @Test
    void migratoryBirdsTest() {
        int[] ar = {1, 4, 4, 4, 5, 5, 5, 3, 3, 3};
        assertEquals(3, MigratoryBirds.migratoryBirds(ar));
    }

    @Test
    void reducedStringTest1() {
        String s = "baab";
        assertEquals("Empty String", ReducedString.super_reduced_string(s));
    }

    @Test
    void reducedStringTest2() {
        String s = "aaabccddd";
        assertEquals("abd", ReducedString.super_reduced_string(s));
    }
}
