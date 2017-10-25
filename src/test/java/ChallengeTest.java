import static org.junit.jupiter.api.Assertions.assertEquals;

import algorithms.implementation.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    void gradingStudentTest() {
        int[] grades = {73, 67, 38, 33};
        int[] results = {75, 67, 40, 33};
        Assert.assertArrayEquals(results, GradingStudents.solve(grades));
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
    void breakingRecordsTest() {
        // 10 5 20 20 4 5 2 25 1
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] results = {2, 4};
        Assert.assertArrayEquals(results, BreakingRecords.getRecord(scores));
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
}
